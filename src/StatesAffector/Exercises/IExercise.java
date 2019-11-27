package StatesAffector.Exercises;

import BoardElement.IBoardElement;
import StatesAffector.CureAffector.ICure;

public interface IExercise extends ICure {
    void workout(IBoardElement boardElement);
}
