package CharacterAffector.CharacterStates;

import Patterns.IPrototype;

public class HealthState implements IState {
    private int liquidDecrement;
    private int solidDecrement;
    private int bathroomSpeed;
    private int speed;
    private int sicknessProbability;
    private int fatigue;
    private int physicExerciseSpeed;
    private int mentalExerciseSpeed;


    public HealthState(int liquidDecrement, int solidDecrement, int bathroomSpeed, int speed, int sicknessProbability, int fatigue, int physicExerciseSpeed, int mentalExerciseSpeed) {
        this.liquidDecrement = liquidDecrement;
        this.solidDecrement = solidDecrement;
        this.bathroomSpeed = bathroomSpeed;
        this.speed = speed;
        this.sicknessProbability = sicknessProbability;
        this.fatigue = fatigue;
        this.physicExerciseSpeed = physicExerciseSpeed;
        this.mentalExerciseSpeed = mentalExerciseSpeed;
    }

    @Override
    public IState getState() {
        return this;
    }

    @Override
    public IPrototype clone() {
        return new HealthState(liquidDecrement, solidDecrement, bathroomSpeed, speed, sicknessProbability, fatigue, physicExerciseSpeed, mentalExerciseSpeed);
    }

    @Override
    public IPrototype deepClone() {
        return new HealthState(liquidDecrement, solidDecrement, bathroomSpeed, speed, sicknessProbability, fatigue, physicExerciseSpeed, mentalExerciseSpeed);
    }
}
