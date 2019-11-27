package StatesAffector.Edibles.Drugs;

import BoardElement.IBoardElement;
import Patterns.IPrototype;
import StatesAffector.CureAffector.ICure;
import StatesAffector.Edibles.IEdible;

public class SleepingPill  implements IDrug, IEdible, ICure {
    @Override
    public void drug(IBoardElement boardElement) {

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
