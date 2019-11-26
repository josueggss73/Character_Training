import BoardElement.IBoardElement;
import CharacterAffector.IStateListing;
import CharacterAffector.IStrategyListing;

public class Game implements IModel{
    private IBoardElement mainCharacter;
    private IStrategyListing sicknessesAvailable;
    private IStateListing healthStatesAvailable;
    private IStrategyListing behavioursAvailable;
    private CharacterCreationComponent creationAPI;
    private Game singleton;
    private ControllerMessageHandler controllerMessageHandler;
    private ILogListing logs;
    private int time;

    //falta implementar
    private Game() {
    }

    public static IModel getInstance() {
        return null;
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
}
