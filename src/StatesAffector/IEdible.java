package StatesAffector;

import BoardElement.IBoardElement;
import StatesAffector.CureAffector.ICure;

public interface IEdible extends ICure {
    String getName();
    void ingest(IBoardElement boardElement);
}
