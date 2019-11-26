package CharacterAffector.CharacterStrategies;

import CharacterAffector.IStateListing;
import CharacterAffector.IStrategy;

public interface ISickness extends IStrategy {
    IStateListing getHealthState();
}
