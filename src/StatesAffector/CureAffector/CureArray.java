package StatesAffector.CureAffector;

import Patterns.IPrototype;
import StatesAffector.ICureListing;

import java.util.ArrayList;

public class CureArray implements ICureListing {
    private ArrayList<ICure> cures;

    public CureArray() {
        cures = new ArrayList<>();
    }

    public CureArray(ArrayList<ICure> cures) {
        this.cures = cures;
    }

    @Override
    public ICure getCure(int index) {
        return cures.get(index);
    }

    @Override
    public void addCure(ICure cure) {
        cures.add(cure);
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        ArrayList<ICure> clonedCures = new ArrayList<>();
        for (int i=0; i<cures.size(); i++){
            clonedCures.add((ICure) cures.get(i).deepClone());
        }
        return new CureArray(clonedCures);
    }
}
