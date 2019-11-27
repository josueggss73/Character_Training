package Model.CharacterAffector.CharacterStrategies.Behaviours;

import BoardElement.IBoardElement;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.Game;
import Patterns.IPrototype;

import java.util.Date;

public class BehaviourLog implements ILog {

    IBoardElement character;
    String details;
    int day;
    String hour;


    public BehaviourLog(IBoardElement character) {
        this.character = character;
        day = Game.getInstance().getDay();
        hour = Game.getInstance().getTimeHour();
    }

    @Override
    public String generateLog(String behaviour) {
        details = details.concat(behaviour+":   ");
        details = details.concat("Día de juego: "+Integer.toString(day)+"   ");
        details = details.concat("Hora de juego: "+hour+"\n");
        details = details.concat(character.toString()); //hacer bonito
        return details;
    }

}
