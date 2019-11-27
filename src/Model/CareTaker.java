package Model;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> mementoList = new ArrayList<>();

    public CareTaker() {
        mementoList = new ArrayList<>();
    }

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(){
        return mementoList.remove(mementoList.size());
    }
}
