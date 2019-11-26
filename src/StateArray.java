import java.util.ArrayList;

public class StateArray implements IStateListing{
    private ArrayList<IState> array;

    @Override
    public IState getState(int index) {
        return array.get(index);
    }
}
