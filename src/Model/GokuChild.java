package Model;

import BoardElement.IBoardElement;
import BoardElement.Tools.IToolListing;
import Media.IMediaListing;
import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.IStrategyListing;

public class GokuChild extends AbstractGoku {

    public GokuChild(int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, IStateListing healthStates, IStrategyListing behaviours, IStrategyListing sicknesses, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(age, liquidLevel, solidLevel, starveLevel, thirstLevel, fatigueLevel, happinessLevel, physicalHealth, mentalHealth, fitnessLevel, speed, healthStates, behaviours, sicknesses, sicknessProbability, physicalHealthMax, mentalHealthMax);
    }

    public GokuChild(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, IStateListing healthStates, IStrategyListing behaviours, IStrategyListing sicknesses, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, age, liquidLevel, solidLevel, starveLevel, thirstLevel, fatigueLevel, happinessLevel, physicalHealth, mentalHealth, fitnessLevel, speed, healthStates, behaviours, sicknesses, sicknessProbability, physicalHealthMax, mentalHealthMax);
    }

    public GokuChild(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, IMediaListing media, int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, IStateListing healthStates, IStrategyListing behaviours, IStrategyListing sicknesses, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, media, age, liquidLevel, solidLevel, starveLevel, thirstLevel, fatigueLevel, happinessLevel, physicalHealth, mentalHealth, fitnessLevel, speed, healthStates, behaviours, sicknesses, sicknessProbability, physicalHealthMax, mentalHealthMax);
    }

    public GokuChild(String name, float defaultLife, int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, IStateListing healthStates, IStrategyListing behaviours, IStrategyListing sicknesses, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(name, defaultLife, age, liquidLevel, solidLevel, starveLevel, thirstLevel, fatigueLevel, happinessLevel, physicalHealth, mentalHealth, fitnessLevel, speed, healthStates, behaviours, sicknesses, sicknessProbability, physicalHealthMax, mentalHealthMax);
    }

    @Override
    public void interact(IBoardElement otherElement) {
        //aqui se haria el case segun el tipo de elemento que venga de parametro
        //ej si es cura de tipo shit, se modifican los parametros
    }
}
