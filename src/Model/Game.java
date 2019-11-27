package Model;

import BoardElement.CharacterCreationComponent;
import BoardElement.IBoardElement;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.IStrategyListing;

public class Game implements IModel{
    private IBoardElement mainCharacter;
    private IStrategyListing strategiesAvailable; //for
    private IStateListing healthStatesAvailable; //for
    private CharacterCreationComponent creationAPI;
    private static Game singleton;
    private ControllerMessageHandler controllerMessageHandler;
    private ILogListing logs;
    private int timeDay;
    private String timeHour;

    //falta implementar
    private Game() {
        singleton = null;
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
    public int getTimeDay(){
        return timeDay;
    }

    @Override
    public String getTimeHour() {
        return timeHour;
    }
}
