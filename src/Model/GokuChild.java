package Model;

import BoardElement.IBoardElement;
import BoardElement.Tools.IToolListing;
import Media.IMediaListing;
import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.IStrategyListing;

public class GokuChild extends AbstractGoku {

    public GokuChild(String name, float defaultLife, IToolListing tools, IMediaListing media, int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(name, defaultLife, tools, media, age, liquidLevel, solidLevel, starveLevel, thirstLevel, fatigueLevel, happinessLevel, physicalHealth, mentalHealth, fitnessLevel, speed, sicknessProbability, physicalHealthMax, mentalHealthMax);
    }

    @Override
    public void interact(IBoardElement otherElement) {
        //aqui se haria el case segun el tipo de elemento que venga de parametro
        //ej si es cura de tipo shit, se modifican los parametros
    }
}
