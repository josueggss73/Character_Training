package Model;

import BoardElement.Character.CharacterListingFactory;
import BoardElement.Character.Concrete.CharacterArray;
import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.Character.ICharacter;
import BoardElement.Character.ICharacterListing;
import BoardElement.CharacterCreationComponent;
import BoardElement.IBoardElement;
import BoardElement.Tools.Concrete.Skill;
import BoardElement.Tools.Concrete.Weapon;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolFactory;
import BoardElement.Tools.ToolListingFactory;
import Media.IMediaElement;
import Media.IMediaListing;
import Media.MediaElementFactory;
import Media.MediaListingFactory;
import Model.CharacterAffector.CharacterStates.IState;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.CharacterAffector.CharacterStrategies.Strategies;
import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.IStrategy;
import Model.CharacterAffector.IStrategyListing;
import Model.CharacterAffector.StateArray;
import Model.CharacterAffector.StrategyArray;
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

        availableCharacters = new CharacterArray();
        strategiesAvailable = new StrategyArray();
        healthStatesAvailable = new StateArray();
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
        ToolListingFactory mediaToolFactory = (ToolListingFactory) creationAPI.getCharacterCreationComponent(CharacterCreationComponent.TOOL_LISTING_FACTORY);

        //-------------------------------------------------------------------------------------------------------------------
        IMediaListing imagesCharacterGoku = mediaListingFactory.getMediaListing(0);
        IMediaElement imageCharacterGoku= mediaElementFactory.getMedia(0);
        imageCharacterGoku.setPath("/images/goku.png");
        imagesCharacterGoku.loadMedia(imageCharacterGoku);

        IToolListing toolListingGoku = mediaToolFactory.getToolListing(0);

        IMediaElement imageSkillGoku= mediaElementFactory.getMedia(0);
        imageSkillGoku.setPath("/images/punchGoku.png");

        Skill.SkillBuilder punchGoku = new Skill.SkillBuilder();
        punchGoku.setName("Punch").setDecrementableLife(10).setDefaultLife(10).setLevel(10).setMinCharacterLevelReq(10)
                .setMinPlayerLevelReq(10).setReach(10).setSimpleUseDecrement(10).setType(1)
                .addMedia(imageSkillGoku);
        ITool toolSkillGoku = punchGoku.build();
        toolListingGoku.addTool(toolSkillGoku);

        AbstractGoku goku = new AbstractGoku("Goku",100,toolListingGoku,imagesCharacterGoku,
                10,100,100,100,100,0,
                100,100,100,100,100,
                100,100,100);
        System.out.printf("Soy:" + goku.getName() + "\n");
        System.out.println("Tengo las imagenes:" + goku.getMedia().getImages().get(0).getPath());
        System.out.println("Tengo una skill" + goku.getTools().getTool(0).getName());
        System.out.println("Tengo una skill" + goku.getTools().getTool(0).getMediaListing().getImages().get(0).getPath());
        //-------------------------------------------------------------------------------------------------------------------

        availableCharacters.addCharacter(goku);
        mainCharacter = goku;

        //-------------------------------------------------------------------------------------------------------------------
        IMediaListing imagesCharacterGoku2 = mediaListingFactory.getMediaListing(0);
        IMediaElement imageCharacterGoku2= mediaElementFactory.getMedia(0);
        imageCharacterGoku2.setPath("/images/goku.png");
        imagesCharacterGoku2.loadMedia(imageCharacterGoku2);

        IToolListing toolListingGoku2 = mediaToolFactory.getToolListing(0);

        IMediaElement imageSkillGoku2= mediaElementFactory.getMedia(0);
        imageSkillGoku2.setPath("/images/punchGoku.png");

        Skill.SkillBuilder punchGoku2 = new Skill.SkillBuilder();
        punchGoku2.setName("Punch2").setDecrementableLife(10).setDefaultLife(10).setLevel(10).setMinCharacterLevelReq(10)
                .setMinPlayerLevelReq(10).setReach(10).setSimpleUseDecrement(10).setType(1)
                .addMedia(imageSkillGoku2);
        ITool toolSkillGoku2 = punchGoku2.build();
        toolListingGoku2.addTool(toolSkillGoku2);

        AbstractGoku goku2 = new AbstractGoku("Goku2",100,toolListingGoku2,imagesCharacterGoku2,
                15,100,100,100,100,0,
                100,100,100,100,100,
                100,100,100);
        System.out.printf("Soy:" + goku2.getName() + "\n");
        System.out.println("Tengo las imagenes:" + goku2.getMedia().getImages().get(0).getPath());
        System.out.println("Tengo una skill" + goku2.getTools().getTool(0).getName());
        System.out.println("Tengo una skill" + goku2.getTools().getTool(0).getMediaListing().getImages().get(0).getPath());
        //-------------------------------------------------------------------------------------------------------------------

        availableCharacters.addCharacter(goku2);

        //-------------------------------------------------------------------------------------------------------------------
        IMediaListing imagesCharacterGoku3 = mediaListingFactory.getMediaListing(0);
        IMediaElement imageCharacterGoku3= mediaElementFactory.getMedia(0);
        imageCharacterGoku3.setPath("/images/goku.png");
        imagesCharacterGoku3.loadMedia(imageCharacterGoku3);

        IToolListing toolListingGoku3 = mediaToolFactory.getToolListing(0);

        IMediaElement imageSkillGoku3= mediaElementFactory.getMedia(0);
        imageSkillGoku3.setPath("/images/punchGoku.png");

        Skill.SkillBuilder punchGoku3 = new Skill.SkillBuilder();
        punchGoku3.setName("Punch3").setDecrementableLife(10).setDefaultLife(10).setLevel(10).setMinCharacterLevelReq(10)
                .setMinPlayerLevelReq(10).setReach(10).setSimpleUseDecrement(10).setType(1)
                .addMedia(imageSkillGoku3);
        ITool toolSkillGoku3 = punchGoku3.build();
        toolListingGoku3.addTool(toolSkillGoku3);

        AbstractGoku goku3 = new AbstractGoku("Goku3",100,toolListingGoku3,imagesCharacterGoku3,
                20,100,100,100,100,0,
                100,100,100,100,100,
                100,100,100);
        System.out.printf("Soy:" + goku3.getName() + "\n");
        System.out.println("Tengo las imagenes:" + goku3.getMedia().getImages().get(0).getPath());
        System.out.println("Tengo una skill" + goku3.getTools().getTool(0).getName());
        System.out.println("Tengo una skill" + goku3.getTools().getTool(0).getMediaListing().getImages().get(0).getPath());
        //-------------------------------------------------------------------------------------------------------------------

        availableCharacters.addCharacter(goku3);

        //-------------------------------------------------------------------------------------------------------------------
        IMediaListing imagesCharacterVeggeta = mediaListingFactory.getMediaListing(0);
        IMediaElement imageCharacterVeggeta= mediaElementFactory.getMedia(0);
        imageCharacterVeggeta.setPath("/images/vegetta.png");
        imagesCharacterVeggeta.loadMedia(imageCharacterVeggeta);

        IToolListing toolListingVeggeta = mediaToolFactory.getToolListing(0);

        IMediaElement imageSkillVeggeta= mediaElementFactory.getMedia(0);
        imageSkillVeggeta.setPath("/images/punchVegetta.png");

        Skill.SkillBuilder punchVeggeta = new Skill.SkillBuilder();
        punchVeggeta.setName("Punch").setDecrementableLife(10).setDefaultLife(10).setLevel(10).setMinCharacterLevelReq(10)
                .setMinPlayerLevelReq(10).setReach(10).setSimpleUseDecrement(10).setType(1)
                .addMedia(imageSkillVeggeta);
        ITool toolSkillVeggeta = punchVeggeta.build();
        toolListingVeggeta.addTool(toolSkillVeggeta);

        AbstractGoku veggeta = new AbstractGoku("Veggeta",100,toolListingVeggeta,imagesCharacterVeggeta,
                10,100,100,100,100,0,
                100,100,100,100,100,
                100,100,100);
        System.out.printf("Soy:" + veggeta.getName() + "\n");
        System.out.println("Tengo las imagenes:" + veggeta.getMedia().getImages().get(0).getPath());
        System.out.println("Tengo una skill" + veggeta.getTools().getTool(0).getName());
        System.out.println("Tengo una skill" + veggeta.getTools().getTool(0).getMediaListing().getImages().get(0).getPath());
        //-------------------------------------------------------------------------------------------------------------------

        StrategyFactory strategyFactory = new StrategyFactory();
        for (int i = 0; i< Strategies.values().length; i++){
            strategiesAvailable.addStrategy(strategyFactory.getStrategy(Strategies.values()[i]));
            System.out.println("Estoy metiendo una nueva estrategia:" + strategyFactory.getStrategy(Strategies.values()[i]).toString());
        }

        StateFactory stateFactory = new StateFactory();
        for (int i = 0; i< States.values().length; i++){
            IState newState = stateFactory.getState(States.values()[i]);
            healthStatesAvailable.addState(newState);
            System.out.println("Estoy metiendo un nuevo estado:" + newState.getSicknessProbability());
            System.out.println("Tengo:" + healthStatesAvailable.getSize());
        }


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
        ICharacter newGoku = searchAvailableGoku(year);
        if(newGoku!=null){
            cloneGokuFeatures(newGoku);
        }
    }

    @Override
    public void setDaysPerYear(int value) {
        daysPerYear = value;
    }

    @Override
    public void setMinutesPerDay(int value) {
        minutesPerDay = value;
    }


    private ICharacter searchAvailableGoku(int age){
        for (int i=0; i<availableCharacters.getSize();i++){
            AbstractGoku abstractGokuTemp = (AbstractGoku) availableCharacters.getCharacter(i);
            if(age == abstractGokuTemp.getAge()){
                return abstractGokuTemp;
            }
        }
        return null;
    }

    private void cloneGokuFeatures(ICharacter newGoku){
        mainCharacter.setName(newGoku.getName());
        mainCharacter.setMedia(newGoku.getMedia());
    }
}
