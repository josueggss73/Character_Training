import BoardElement.IBoardElement;

public class ControllerMessageHandler {

    public void handleMessage(Message message){
        if(message.equals(Message.EAT)){
            CharacterProxy characterProxy = new CharacterProxy();
        }
    }
}
