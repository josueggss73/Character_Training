package Model;

import Model.CharacterAffector.CharacterStrategies.ILog;
import Patterns.IPrototype;

public interface ILogListing extends IPrototype<ILogListing> {
    ILog getLog(int index);
    void addLog(ILog log);
}
