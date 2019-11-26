import java.util.ArrayList;

public class CureArray implements ICureListing {
    private ArrayList<ICure> cures;

    public CureArray() {
        cures = new ArrayList<>();
    }

    @Override
    public ICure getCure(int index) {
        return cures.get(index);
    }

    @Override
    public void addCure(ICure cure) {
        cures.add(cure);
    }
}
