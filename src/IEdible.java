import BoardElement.IBoardElement;

public interface IEdible extends ICure{
    String getName();
    void ingest(IBoardElement boardElement);
}
