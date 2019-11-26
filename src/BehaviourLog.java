import BoardElement.IBoardElement;

public class BehaviourLog implements ILog {

    IBoardElement character;

    public BehaviourLog(IBoardElement character) {
        this.character = character;
    }

    @Override
    public String generateLog() {
        String log = "necesito modificarme";
        return log;
    }
}
