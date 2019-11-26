package StatesAffector.CureAffector;

import BoardElement.IBoardElement;
import Patterns.IPrototype;

public interface ICure extends IPrototype<ICure> {
    ICure getCure();
    IBoardElement cure(IBoardElement boardElement);
    String getName();
}
