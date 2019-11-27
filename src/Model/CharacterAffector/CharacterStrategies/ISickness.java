package Model.CharacterAffector.CharacterStrategies;

import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.IStrategy;

public interface ISickness extends IStrategy {
    IStateListing getHealthState();
}
