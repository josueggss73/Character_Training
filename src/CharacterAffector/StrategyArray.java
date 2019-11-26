package CharacterAffector;

import Patterns.IPrototype;

import java.util.ArrayList;

public class StrategyArray implements IStrategyListing {

    private ArrayList<IStrategy> strategies;

    public StrategyArray() {
        strategies = new ArrayList<>();
    }

    public StrategyArray(ArrayList<IStrategy> strategies) {
        this.strategies = strategies;
    }

    @Override
    public IStrategy getStrategy(int index) {
        return strategies.get(index);
    }

    @Override
    public void addStrategy(IStrategy strategy) {
        strategies.add(strategy);
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        ArrayList<IStrategy> clonedStrategies = new ArrayList<>();
        for (int i=0; i<strategies.size(); i++){
            strategies.add((IStrategy) strategies.get(i).deepClone());
        }
        return new StrategyArray(clonedStrategies);
    }
}
