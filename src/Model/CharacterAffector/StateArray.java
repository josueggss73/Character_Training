package Model.CharacterAffector;

import Model.CharacterAffector.CharacterStates.IState;
import Patterns.IPrototype;

import java.util.ArrayList;

public class StateArray implements IStateListing {
    private ArrayList<IState> states;

    public StateArray(ArrayList<IState> states) {
        this.states = states;
    }

    @Override
    public IState getState(int index) {
        return states.get(index);
    }

    @Override
    public void addState(IState state) {
        states.add(state);
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        ArrayList<IState> clonedStates = new ArrayList<>();
        for (int i=0; i<states.size(); i++){
            clonedStates.add((IState) states.get(i).deepClone());
        }
        return new StateArray(clonedStates);
    }
}
