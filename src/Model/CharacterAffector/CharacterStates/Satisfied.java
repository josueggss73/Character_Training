package Model.CharacterAffector.CharacterStates;

import Model.States;
import Patterns.IPrototype;

public class Satisfied implements IState {
    private States name;
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
    private int sicknessProbability;

    private int physicalHealthMax;
    private int mentalHealthMax;

    public Satisfied(){
        name = States.SATISFIED;
        age = 0;
        liquidLevel = 0;
        solidLevel = 0;
        starveLevel = 0;
        thirstLevel = 0;
        fatigueLevel = -10;
        happinessLevel = 10;
        physicalHealth = 0;
        mentalHealth = 0;
        fitnessLevel = 0;
        speed = 5;
        sicknessProbability = -10;
        physicalHealthMax = 0;
        mentalHealthMax = 0;
    }

    @Override
    public States getName() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public int getLiquidLevel() {
        return 0;
    }

    @Override
    public int getSolidLevel() {
        return 0;
    }

    @Override
    public int getStarveLevel() {
        return 0;
    }

    @Override
    public int getThirstLevel() {
        return 0;
    }

    @Override
    public int getFatigueLevel() {
        return 0;
    }

    @Override
    public int getHappinessLevel() {
        return 0;
    }

    @Override
    public int getPhysicalHealth() {
        return 0;
    }

    @Override
    public int getMentalHealth() {
        return 0;
    }

    @Override
    public int getFitnessLevel() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getSicknessProbability() {
        return 0;
    }

    @Override
    public int getPhysicalHealthMax() {
        return 0;
    }

    @Override
    public int getMentalHealthMax() {
        return 0;
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
