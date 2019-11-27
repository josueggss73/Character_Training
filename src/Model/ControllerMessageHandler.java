package Model;

import BoardElement.Character.ICharacter;
import Model.CharacterAffector.CharacterStrategies.Behaviours.Shit;
import Model.CharacterAffector.CharacterStrategies.Strategies;
import Model.CharacterAffector.IStrategy;

public class ControllerMessageHandler {

    public void handleMessage(Strategies message){
        StrategyFactory strategyFactory = new StrategyFactory();
        strategyFactory.getStrategy(message);
    }
}
