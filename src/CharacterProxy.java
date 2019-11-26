import BoardElement.IBoardElement;

public class CharacterProxy implements IBoardElement {

    private ILog log;
    private IBoardElement character;

    public CharacterProxy() {
        character = Game.getInstance().getMainCharacter();
        log = new BehaviourLog(character);
    }

    @Override
    public void interact(IBoardElement iBoardElement) {
        character.interact(null);
        log.generateLog();
        Game.getInstance().addLog(log);
    }
}