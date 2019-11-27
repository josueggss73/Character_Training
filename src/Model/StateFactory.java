package Model;

import Model.CharacterAffector.CharacterStates.*;

public class StateFactory {

    public IState getState(States state){
        switch (state){
            case HAPPY:
                return new Happy();
            case SAD:
                return new Sad();
            case ENERGIZED:
                return new Energized();
            case TIRED:
                return new Tired();
            case STARVING:
                return new Starving();
            case GLUTTONY:
                return new Gluttony();
            case FOOD_RESIGNED:
                return new FoodResigned();
            case SATISFIED:
                return new Satisfied();
            case HIDRATED:
                return new Hidrated();
            default:
                return new DefaultState();
        }
    }
}
