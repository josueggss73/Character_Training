package Model;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<IMemento> mementoList = new ArrayList<>();

    public void add(IMemento state){
        mementoList.add(state);
    }

    public IMemento get(int index){
        return mementoList.get(index);
    }
}
