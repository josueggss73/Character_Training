package Model;

import BoardElement.Character.CharacterAbstract;
import BoardElement.IBoardElement;
import BoardElement.Tools.IToolListing;
import Media.IMediaListing;
import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.IStrategyListing;

public abstract class AbstractGoku extends CharacterAbstract {
    private int age;
    private int liquidLevel;
    private int solidLevel;
    private int starveLevel;
    private int thirstLevel;
    private int fatigueLevel;
    private int happinessLevel;
    private int physicalHealth;
    private int mentalHealth; //sad y happy?
    private int fitnessLevel;
    private int speed;
    private IStateListing healthStates;
    private IStrategyListing behaviours;
    private IStrategyListing sicknesses;
    private int sicknessProbability;

    private int physicalHealthMax;
    private int mentalHealthMax;

    public AbstractGoku(int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, IStateListing healthStates, IStrategyListing behaviours, IStrategyListing sicknesses, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        this.age = age;
        this.liquidLevel = liquidLevel;
        this.solidLevel = solidLevel;
        this.starveLevel = starveLevel;
        this.thirstLevel = thirstLevel;
        this.fatigueLevel = fatigueLevel;
        this.happinessLevel = happinessLevel;
        this.physicalHealth = physicalHealth;
        this.mentalHealth = mentalHealth;
        this.fitnessLevel = fitnessLevel;
        this.speed = speed;
        this.healthStates = healthStates;
        this.behaviours = behaviours;
        this.sicknesses = sicknesses;
        this.sicknessProbability = sicknessProbability;
        this.physicalHealthMax = physicalHealthMax;
        this.mentalHealthMax = mentalHealthMax;
    }

    public AbstractGoku(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, IStateListing healthStates, IStrategyListing behaviours, IStrategyListing sicknesses, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields);
        this.age = age;
        this.liquidLevel = liquidLevel;
        this.solidLevel = solidLevel;
        this.starveLevel = starveLevel;
        this.thirstLevel = thirstLevel;
        this.fatigueLevel = fatigueLevel;
        this.happinessLevel = happinessLevel;
        this.physicalHealth = physicalHealth;
        this.mentalHealth = mentalHealth;
        this.fitnessLevel = fitnessLevel;
        this.speed = speed;
        this.healthStates = healthStates;
        this.behaviours = behaviours;
        this.sicknesses = sicknesses;
        this.sicknessProbability = sicknessProbability;
        this.physicalHealthMax = physicalHealthMax;
        this.mentalHealthMax = mentalHealthMax;
    }

    public AbstractGoku(String name, float defaultLife, float decrementableLife, IToolListing tools, float level, float minPlayerLevelReq, float hitsPerUnit, int fields, IMediaListing media, int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, IStateListing healthStates, IStrategyListing behaviours, IStrategyListing sicknesses, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(name, defaultLife, decrementableLife, tools, level, minPlayerLevelReq, hitsPerUnit, fields, media);
        this.age = age;
        this.liquidLevel = liquidLevel;
        this.solidLevel = solidLevel;
        this.starveLevel = starveLevel;
        this.thirstLevel = thirstLevel;
        this.fatigueLevel = fatigueLevel;
        this.happinessLevel = happinessLevel;
        this.physicalHealth = physicalHealth;
        this.mentalHealth = mentalHealth;
        this.fitnessLevel = fitnessLevel;
        this.speed = speed;
        this.healthStates = healthStates;
        this.behaviours = behaviours;
        this.sicknesses = sicknesses;
        this.sicknessProbability = sicknessProbability;
        this.physicalHealthMax = physicalHealthMax;
        this.mentalHealthMax = mentalHealthMax;
    }

    public AbstractGoku(String name, float defaultLife, int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, IStateListing healthStates, IStrategyListing behaviours, IStrategyListing sicknesses, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(name, defaultLife);
        this.age = age;
        this.liquidLevel = liquidLevel;
        this.solidLevel = solidLevel;
        this.starveLevel = starveLevel;
        this.thirstLevel = thirstLevel;
        this.fatigueLevel = fatigueLevel;
        this.happinessLevel = happinessLevel;
        this.physicalHealth = physicalHealth;
        this.mentalHealth = mentalHealth;
        this.fitnessLevel = fitnessLevel;
        this.speed = speed;
        this.healthStates = healthStates;
        this.behaviours = behaviours;
        this.sicknesses = sicknesses;
        this.sicknessProbability = sicknessProbability;
        this.physicalHealthMax = physicalHealthMax;
        this.mentalHealthMax = mentalHealthMax;
    }

    @Override
    public void interact(IBoardElement otherElement) {
        //aqui se haria el case segun el tipo de elemento que venga de parametro
    }
}
