package Model.CharacterAffector.CharacterStrategies.Behaviours;

import BoardElement.IBoardElement;
import Model.*;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.CharacterAffector.IStrategy;
import Patterns.IPrototype;
import StatesAffector.CureAffector.ICure;

public class Shit implements IBehaviour {

    private ILog log;
    private ICure cure;

    public Shit() {
        CureFactory cureFactory = new CureFactory();
        cure = cureFactory.getCure(Cures.SHIT);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void doSomething(IBoardElement boardElement) {
        boardElement.interact(cure);
        log = new BehaviourLog(boardElement);
        String newLog = log.generateLog();
        Game.getInstance().addLog(log);
    }

    @Override
    public IStrategy getStrategy() {
        return null;
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }
}
