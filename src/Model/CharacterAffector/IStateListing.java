package Model.CharacterAffector;

import Model.CharacterAffector.CharacterStates.IState;
import Model.States;
import Patterns.IPrototype;

public interface IStateListing extends IPrototype<IStateListing> {
    IState getState(int index);
    void addState(IState state);
    void deleteState(States state);
    void deleteAllStates();
}
