package Model;

import Model.CharacterAffector.CharacterStrategies.Behaviours.*;
import Model.CharacterAffector.CharacterStrategies.Sicknesses.*;
import Model.CharacterAffector.CharacterStrategies.Strategies;
import Model.CharacterAffector.IStrategy;
import com.sun.org.apache.regexp.internal.RE;

public class StrategyFactory {

    IStrategy getStrategy(Strategies strategy){
        switch (strategy){
            //BEHAVIOURS
            case SLEEP:
                return new Sleep();
            case EAT:
                return new Eat();
            case SHIT:
                return new Shit();
            case PEE:
                return new Pee();
            case DIE:
                return new Die();
            case PLAY:
                return new Play();
            case FIGHT:
                return new Fight();
            case WORKOUT:
                return new Workout();
            case GET_SICK:
                return new GetSick(); //parametros?
            case MEDITATE:
                return new Meditate();

            //SICKNESSES
            case MUSCLE_PAIN:
                return new MusclePain();
            case DIHARREA:
                return new Diharrea();
            case DEPRESSION:
                return new Depression();
            case EXHAUSTION:
                return new Exhaustion();
            case HEADACHE:
                return new Headache();
            case FRACTURE:
                return new Fracture();
        }

        //strategy.equals(Model.CharacterAffector.CharacterStrategies.Strategies.loquesea)
        return null;
    }
}
