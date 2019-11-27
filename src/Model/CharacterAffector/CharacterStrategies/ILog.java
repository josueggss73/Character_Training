package Model.CharacterAffector.CharacterStrategies;

import Patterns.IPrototype;

public interface ILog extends IPrototype {
    String generateLog(String strategy);
}
