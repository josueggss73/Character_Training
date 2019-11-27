package Model;

import BoardElement.Character.CharacterListingFactory;
import BoardElement.Character.ICharacter;
import BoardElement.Character.ICharacterListing;
import BoardElement.CharacterCreationComponent;
import BoardElement.IBoardElement;
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
    }

    public static IModel getInstance() {
        if(singleton == null){
            singleton = new Game();
        }
        return singleton;
    }

    @Override
    public void readMemory() {

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
