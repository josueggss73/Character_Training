package Model.CharacterAffector.CharacterStrategies.Behaviours;

import BoardElement.IBoardElement;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.CharacterAffector.CharacterStrategies.Strategies;
import Model.CureFactory;
import Model.Cures;
import Model.Game;
import Patterns.IPrototype;
import StatesAffector.CureAffector.ICure;

public class Play implements IBehaviour {
    private ILog log;
    private Strategies name;

    public Play() {
        this.name = Strategies.PLAY;
    }

    @Override
    public Strategies getName() {
        return name;
    }

    @Override
    public void doSomething(IBoardElement boardElement) {
        CureFactory cureFactory = new CureFactory();
        ICure cure = cureFactory.getCure(Cures.GET_HAPPY);
        cure.cure(boardElement);
        log = new BehaviourLog(boardElement);
        String newLog = log.generateLog(Strategies.PLAY.toString()); //la variable se puede usar para printear
        Game.getInstance().addLog(log);
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return new Play();
    }
}
