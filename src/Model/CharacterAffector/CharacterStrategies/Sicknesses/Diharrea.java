package Model.CharacterAffector.CharacterStrategies.Sicknesses;

import BoardElement.IBoardElement;
import Model.*;
import Model.CharacterAffector.CharacterStates.IState;
import Model.CharacterAffector.CharacterStrategies.Behaviours.BehaviourLog;
import Model.CharacterAffector.CharacterStrategies.Behaviours.IBehaviour;
import Model.CharacterAffector.CharacterStrategies.ILog;
import Model.CharacterAffector.CharacterStrategies.Strategies;
import Model.CharacterAffector.IStateListing;
import Patterns.IPrototype;

public class Diharrea implements IBehaviour {
    private ILog log;
    private Strategies name;

    public Diharrea() {
        name = Strategies.DIHARREA;
    }

    @Override
    public Strategies getName() {
        return name;
    }

    @Override
    public void doSomething(IBoardElement boardElement) {
        StateFactory stateFactory = new StateFactory();
        IState state1 = stateFactory.getState(States.SHIT_URGENCY);
        IState state2 = stateFactory.getState(States.TIRED);
        IState state3 = stateFactory.getState(States.DEHYDRATED);
        IState state4 = stateFactory.getState(States.SAD);

        if(boardElement instanceof AbstractGoku){
            ((AbstractGoku) boardElement).getStates().addState(state1);
            ((AbstractGoku) boardElement).getStates().addState(state2);
            ((AbstractGoku) boardElement).getStates().addState(state3);
            ((AbstractGoku) boardElement).getStates().addState(state4);

        }
        StateListingFactory stateListingFactory = new StateListingFactory();
        IStateListing states = stateListingFactory.getStateListing(StateListings.ARRAY);
        states.addState(state1);
        states.addState(state2);
        states.addState(state3);
        states.addState(state4);

        log = new SicknessLog(boardElement, states);
        String newLog = log.generateLog(name.toString()); //la variable se puede usar para printear
        Game.getInstance().addLog(log);
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return new Diharrea();
    }
}
