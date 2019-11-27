package StatesAffector.Edibles.Foods;

import BoardElement.IBoardElement;
import StatesAffector.Edibles.IEdible;

public interface IFood extends IEdible {
    void feed(IBoardElement boardElement);
}
