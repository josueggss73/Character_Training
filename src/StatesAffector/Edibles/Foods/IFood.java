package StatesAffector.Edibles.Foods;

import StatesAffector.Edibles.IEdible;

public interface IFood extends IEdible {
    int getSolidContent();
    int getLiquidContent();
}
