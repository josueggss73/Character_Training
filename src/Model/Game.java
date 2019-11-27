package Model;

import BoardElement.Character.CharacterListingFactory;
import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.Character.ICharacter;
import BoardElement.Character.ICharacterListing;
import BoardElement.CharacterCreationComponent;
import BoardElement.IBoardElement;
import BoardElement.Tools.Concrete.Skill;
import BoardElement.Tools.Concrete.Weapon;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import Media.IMediaElement;
import Media.IMediaListing;
import Media.MediaElementFactory;
import Media.MediaListingFactory;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.IStrategyListing;
import StatesAffector.CureAffector.CureArray;
import StatesAffector.ICureListing;

public class Game implements IModel{
    private ICharacter mainCharacter;
    private ICharacterListing availableCharacters; //for
    private IStrategyListing strategiesAvailable; //for
    private IStateListing healthStatesAvailable; //for

    private CharacterCreationComponent creationAPI;

    private static Game singleton;

    private ControllerMessageHandler controllerMessageHandler;
    private ILogListing logs;

    private int day;
    private int year;
    private String timeHour;
    private int daysPerYear;
    private int minutesPerDay;

    private ICureListing cellar;
    private ICureListing horchard;

    //falta implementar
    private Game() {
        singleton = null;
        creationAPI = CharacterCreationComponent.getInstance();
        controllerMessageHandler = new ControllerMessageHandler();
        logs = new LogArray();
        day = 0;
        year = 0;
        timeHour = "00:00:01";
        cellar = new CureArray();
        horchard = new CureArray();
        readMemory();
    }

    public static IModel getInstance() {
        if(singleton == null){
            singleton = new Game();
        }
        return singleton;
    }

    @Override
    public void readMemory() {
        MediaListingFactory mediaListingFactory = (MediaListingFactory) creationAPI.getCharacterCreationComponent(CharacterCreationComponent.MEDIA_LISTING_FACTORY);
        MediaElementFactory mediaElementFactory = (MediaElementFactory) creationAPI.getCharacterCreationComponent(CharacterCreationComponent.MEDIA_ELEMENT_FACTORY);

        IMediaListing imagesCharacter = mediaListingFactory.getMediaListing(0);
        IMediaElement imageCharacterLvl0= mediaElementFactory.getMedia(0);
        imageCharacterLvl0.setPath("");
        IMediaElement imageCharacterLvl1 = mediaElementFactory.getMedia(0);
        imageCharacterLvl1.setPath("");
        IMediaElement imageCharacterLvl2 = mediaElementFactory.getMedia(0);
        imageCharacterLvl2.setPath("");
        imagesCharacter.loadMedia(imageCharacterLvl0);
        imagesCharacter.loadMedia(imageCharacterLvl1);
        imagesCharacter.loadMedia(imageCharacterLvl2);

        CharacterBasic.CharacterBasicBuilder characterBasicBuilder = new CharacterBasic.CharacterBasicBuilder();
        characterBasicBuilder.setDecrementableLife(10).setDefaultLife(10).setFields(10).setHitsPerUnit(10)
                .setLevel(10).setMinPlayerLevelReq(10).setName("Goku").addImage(imageCharacterLvl0)
                .addImage(imageCharacterLvl1).addImage(imageCharacterLvl2);
        ICharacter character = characterBasicBuilder.build();
        character.toString();
    }

    @Override
    public void writeMemory() {

    }

    public IBoardElement getMainCharacter() {
        return mainCharacter;
    }

    public void addLog(ILog log){
        logs.addLog(log);
    }

    @Override
    public int getDay(){
        return day;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getTimeHour() {
        return timeHour;
    }

    @Override
    public ControllerMessageHandler getHandler() {
        return controllerMessageHandler;
    }

    @Override
    public ICureListing getCellar() {
        return cellar;
    }

    @Override
    public void finishDayCycle() {
        if(day%daysPerYear == 0){ //si se cumple un año
            year++;
        }
        ((AbstractGoku) mainCharacter).endDay();
    }

    @Override
    public void setDaysPerYear(int value) {
        daysPerYear = value;
    }

    @Override
    public void setMinutesPerDay(int value) {
        minutesPerDay = value;
    }

}
