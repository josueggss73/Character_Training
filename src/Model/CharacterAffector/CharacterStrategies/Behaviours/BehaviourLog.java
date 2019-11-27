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

    public BehaviourLog(IBoardElement character, String details, int day, String hour) {
        this.character = character;
        this.details = details;
        this.day = day;
        this.hour = hour;
    }

    @Override
    public String generateLog(String behaviour) {
        details = details.concat(behaviour+":   ");
        details = details.concat("Día de juego: "+Integer.toString(day)+"   ");
        details = details.concat("Hora de juego: "+hour+"\n");
        details = details.concat(character.toString()); //hacer bonito
        return details;
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return new BehaviourLog(character, details, day, hour);
    }
}
