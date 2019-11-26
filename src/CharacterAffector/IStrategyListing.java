package CharacterAffector;

import Patterns.IPrototype;

public interface IStrategyListing extends IPrototype<IStrategyListing> {
    IStrategy getStrategy(int index);
    void addStrategy(IStrategy strategy);
}
