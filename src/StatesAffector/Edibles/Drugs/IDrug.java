package StatesAffector.Edibles.Drugs;

import BoardElement.IBoardElement;
import StatesAffector.Edibles.IEdible;

public interface IDrug extends IEdible {
    void drug(IBoardElement boardElement);
}
