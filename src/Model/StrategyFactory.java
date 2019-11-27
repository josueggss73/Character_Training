package Model;

import Model.CharacterAffector.CharacterStrategies.Behaviours.*;
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
            case DIHARREA:
            case DEPRESSION:
            case EXHAUSTION:
            case HEADACHE:
            case FRACTURE:
        }

        //strategy.equals(Model.CharacterAffector.CharacterStrategies.Strategies.loquesea)
        return null;
    }
}
