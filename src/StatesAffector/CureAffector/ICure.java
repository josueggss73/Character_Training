package StatesAffector.CureAffector;

import BoardElement.IBoardElement;
import Patterns.IPrototype;

public interface ICure extends IPrototype<ICure>, IBoardElement{
    IBoardElement cure(IBoardElement boardElement);
    String getName();
}
