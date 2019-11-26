import BoardElement.IBoardElement;

public interface IModel {
    //IModel getInstance();
    void readMemory();
    void writeMemory();
    IBoardElement getMainCharacter();
    void addLog(ILog log);
}
