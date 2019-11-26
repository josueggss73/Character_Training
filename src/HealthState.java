public class HealthState implements IState{
    private int liquidDecrement;
    private int solidDecrement;
    private int bathroomSpeed;
    private int speed;
    private int sicknessProbability;
    private int fatigue;
    private int physicExerciseSpeed;
    private int mentalExerciseSpeed;

    @Override
    public IState getState() {
        return this;
    }
}
