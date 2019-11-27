package Model;

import BoardElement.IBoardElement;
import Model.CharacterAffector.CharacterStrategies.ILog;
import StatesAffector.ICureListing;

public interface IModel {
    void readMemory();
    void writeMemory();
    IBoardElement getMainCharacter();
    void addLog(ILog log);
    int getTimeDay();
    String getTimeHour();
    ControllerMessageHandler getHandler();
    ICureListing getCellar();
}
