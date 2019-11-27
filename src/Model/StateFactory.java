package Model;

import Model.CharacterAffector.CharacterStates.*;

public class StateFactory {

    public IState getState(States state){
        switch (state){
            case HAPPY:
                return new Happy();
            case SAD:
                return new Sad();
            case SHITURGENCY:
                return new ShitUrgency();
            case DEHYDRATED:
                return new Dehydrated();
            case INJURED:
                return new Injured();
            case DEFAULT:
                return new DefaultState();
            default:
                return null;
        }
    }
}
