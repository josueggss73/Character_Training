package Model.CharacterAffector.CharacterStrategies.Sicknesses;

import BoardElement.IBoardElement;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.CharacterAffector.IStateListing;
import Model.Game;

public class SicknessLog implements ILog {
    IBoardElement character;
    String details;
    int day;
    String hour;
    IStateListing states;

    public SicknessLog(IBoardElement character, IStateListing states) {
        this.character = character;
        day = Game.getInstance().getTimeDay();
        hour = Game.getInstance().getTimeHour();
        this.states = states;
    }

    @Override
    public String generateLog(String sickness) {
        details = details.concat(sickness+":   ");
        details = details.concat("Día de juego: "+Integer.toString(day)+"   ");
        details = details.concat("Hora de juego: "+hour+"\n");
        details = details.concat("Estados adquiridos: ");

        details = details.concat(character.toString()); //hacer bonito
        return details;
        //listar todos los estados
    }
}
