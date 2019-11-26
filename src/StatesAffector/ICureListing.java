package StatesAffector;

import Patterns.IPrototype;
import StatesAffector.CureAffector.ICure;

public interface ICureListing extends IPrototype<ICureListing> {
    ICure getCure(int index);
    void addCure(ICure cure);
}
