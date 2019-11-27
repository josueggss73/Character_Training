package Model;

import BoardElement.IBoardElement;
import Model.CharacterAffector.CharacterStrategies.ILog;
import StatesAffector.ICureListing;

public interface IModel extends IMemento {
    void readMemory();
    void writeMemory();
    IBoardElement getMainCharacter();
    void addLog(ILog log);
    int getDay();
    int getYear();
    String getTimeHour();
    ControllerMessageHandler getHandler();
    ICureListing getCellar();
    void finishDayCycle();
    void setDaysPerYear(int value);
    void setMinutesPerDay(int value);
}
