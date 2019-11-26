import BoardElement.IBoardElement;

public interface IModel {
    void readMemory();
    void writeMemory();
    IBoardElement getMainCharacter();
    void addLog(ILog log);
}
