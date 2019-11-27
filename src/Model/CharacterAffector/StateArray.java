package Model.CharacterAffector;

import Model.CharacterAffector.CharacterStates.IState;
import Model.States;
import Patterns.IPrototype;

import java.util.ArrayList;

public class StateArray implements IStateListing {
    private ArrayList<IState> states;

    public StateArray() {
        states = new ArrayList<>();
    }

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
    public void deleteState(States state) {
        for (int i=0; i<states.size(); i++){
            if(states.get(i).getName().equals(state)){
                states.remove(i);
            }
        }
    }

    @Override
    public void deleteAllStates() {
        for (int i=0; i<states.size(); i++){
            states.remove(i);
        }
    }

    @Override
    public int getSize() {
        return states.size();
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

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i<states.size(); i++){
            result = result.concat(states.toString()+",  ");
        }
        return result;
    }
}
