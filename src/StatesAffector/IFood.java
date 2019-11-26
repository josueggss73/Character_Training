package StatesAffector;

import StatesAffector.IEdible;

public interface IFood extends IEdible {
    int getSolidContent();
    int getLiquidContent();
}
