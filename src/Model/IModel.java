package Model;

import BoardElement.IBoardElement;
import Model.CharacterAffector.CharacterStrategies.ILog;

public interface IModel {
    void readMemory();
    void writeMemory();
    IBoardElement getMainCharacter();
    void addLog(ILog log);
}
