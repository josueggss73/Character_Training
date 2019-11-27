package Model;

public class Memento {
    private IModel game;

    public Memento(IModel game) {
        this.game = game;
    }

    IModel getState(){
        return game;
    }
}
