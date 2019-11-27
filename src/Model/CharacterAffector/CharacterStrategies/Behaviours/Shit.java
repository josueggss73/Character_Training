package Model.CharacterAffector.CharacterStrategies.Behaviours;

import BoardElement.IBoardElement;
import Model.*;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.CharacterAffector.CharacterStrategies.Strategies;
import Patterns.IPrototype;
import StatesAffector.CureAffector.ICure;

public class Shit implements IBehaviour {

    private ILog log;
    private Strategies name;

    public Shit() {
        name = Strategies.SHIT;
    }

    @Override
    public Strategies getName() {
        return null;
    }

    @Override
    public void doSomething(IBoardElement boardElement) {
        CureFactory cureFactory = new CureFactory();
        ICure cure = cureFactory.getCure(Cures.LOOSE_SOLIDS);
        cure.cure(boardElement);
        log = new BehaviourLog(boardElement);
        String newLog = log.generateLog(Strategies.SHIT.toString()); //la variable se puede usar para printear
        Game.getInstance().addLog(log);
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return new Shit();
    }
}
