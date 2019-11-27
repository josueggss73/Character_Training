package Model;

import BoardElement.Character.ICharacter;
import Model.CharacterAffector.CharacterStrategies.Behaviours.Shit;
import Model.CharacterAffector.IStrategy;

public class ControllerMessageHandler {

    public void handleMessage(Message message){
        IStrategy strategy;
        if(message.equals(Message.SHIT)){ //aqui es el for?
            strategy = new Shit();
            ICharacter mainCharacter = (ICharacter) Game.getInstance().getMainCharacter();
            strategy.doSomething(mainCharacter);
        }
    }
}
