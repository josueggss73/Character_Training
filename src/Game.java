import BoardElement.IBoardElement;

public class Game implements IModel{
    private IBoardElement mainCharacter;
    private IStrategyListing sicknessesAvailable;
    private IStateListing healthStatesAvailable;
    private IStateListing behavioursAvailable;
    private CharacterCreationComponent creationAPI;
    private Game singleton;

    //falta implementar
    private Game() {
    }

    @Override
    public IModel getInstance() {
        return null;
    }

    @Override
    public void readMemory() {

    }

    @Override
    public void writeMemory() {

    }
}
