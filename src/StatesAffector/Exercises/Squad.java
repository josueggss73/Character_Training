package StatesAffector.Exercises;

import BoardElement.IBoardElement;
import Patterns.IPrototype;
import StatesAffector.CureAffector.ICure;

public class Squad implements IExercise {

    @Override
    public void workout(IBoardElement boardElement) {

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
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }
}
