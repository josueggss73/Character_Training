import BoardElement.IBoardElement;

public class Game implements IModel{
    private IBoardElement mainCharacter;
    private IStrategyListing sicknessesAvailable;
    private IStateListing healthStatesAvailable;
    private IStrategyListing behavioursAvailable;
    private CharacterCreationComponent creationAPI;
    private Game singleton;
    private ControllerMessageHandler controllerMessageHandler;
    private ILogListing logs;

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
