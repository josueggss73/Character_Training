package Model;

import Model.CharacterAffector.CharacterStrategies.ILog;

public interface ILogListing {
    ILog getLog(int index);
    void addLog(ILog log);
}
