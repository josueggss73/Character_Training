package Model;

import Model.CharacterAffector.CharacterStates.DefaultState;
import Model.CharacterAffector.CharacterStates.Happy;
import Model.CharacterAffector.CharacterStates.IState;
import Model.CharacterAffector.CharacterStates.Sad;

public class StateFactory {

    public IState getState(States state){
        switch (state){
            case HAPPY:
                return new Happy();
            case SAD:
                return new Sad();
            default:
                return new DefaultState();
        }
    }
}
