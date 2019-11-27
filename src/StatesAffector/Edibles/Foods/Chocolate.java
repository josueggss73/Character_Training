package StatesAffector.Edibles.Foods;

import BoardElement.IBoardElement;
import Patterns.IPrototype;
import StatesAffector.CureAffector.ICure;
import StatesAffector.Edibles.IEdible;

public class Chocolate implements IFood, IEdible, ICure {
    @Override
    public int getSolidContent() {
        return 0;
    }

    @Override
    public int getLiquidContent() {
        return 0;
    }

    @Override
    public ICure getCure() {
        return null;
    }

    @Override
    public IBoardElement cure(IBoardElement boardElement) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void ingest(IBoardElement boardElement) {

    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }
}
