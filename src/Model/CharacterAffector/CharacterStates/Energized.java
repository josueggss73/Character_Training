package Model.CharacterAffector.CharacterStates;

import Model.States;
import Patterns.IPrototype;

public class Energized implements IState {
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

    void Tired(){
        name = States.TIRED;
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
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getLiquidLevel() {
        return liquidLevel;
    }

    @Override
    public int getSolidLevel() {
        return solidLevel;
    }

    @Override
    public int getStarveLevel() {
        return starveLevel;
    }

    @Override
    public int getThirstLevel() {
        return thirstLevel;
    }

    @Override
    public int getFatigueLevel() {
        return fatigueLevel;
    }

    @Override
    public int getHappinessLevel() {
        return happinessLevel;
    }

    @Override
    public int getPhysicalHealth() {
        return physicalHealth;
    }

    @Override
    public int getMentalHealth() {
        return mentalHealth;
    }

    @Override
    public int getFitnessLevel() {
        return fitnessLevel;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getSicknessProbability() {
        return sicknessProbability;
    }

    @Override
    public int getPhysicalHealthMax() {
        return physicalHealthMax;
    }

    @Override
    public int getMentalHealthMax() {
        return mentalHealthMax;
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
