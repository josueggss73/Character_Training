import BoardElement.IBoardElement;

public interface IStrategy {
    void doSomething(IBoardElement boardElement);
    IStrategy getStrategy();
}
