package CharacterAffector;

import BoardElement.IBoardElement;
import Patterns.IPrototype;

public interface IStrategy extends IPrototype<IStrategy> {
    void doSomething(IBoardElement boardElement);
    IStrategy getStrategy();
}
