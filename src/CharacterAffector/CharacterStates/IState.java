package CharacterAffector.CharacterStates;

import Patterns.IPrototype;

public interface IState extends IPrototype<IState> {
    IState getState();
}
