package Model.CharacterAffector;

import Model.CharacterAffector.CharacterStates.IState;
import Patterns.IPrototype;

public interface IStateListing extends IPrototype<IStateListing> {
    IState getState(int index);
    void addState(IState state);
}
