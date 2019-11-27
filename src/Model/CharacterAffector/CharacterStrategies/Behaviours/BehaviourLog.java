package Model.CharacterAffector.CharacterStrategies.Behaviours;

import BoardElement.IBoardElement;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Patterns.IPrototype;

import java.util.Date;

public class BehaviourLog implements ILog {

    IBoardElement character;
    String details;
    Date date;

    public BehaviourLog(IBoardElement character) {
        this.character = character;
        this.date = new Date(System.currentTimeMillis());
    }

    @Override
    public String generateLog() {
        details = "necesito modificarme";
        return details;
    }

}
