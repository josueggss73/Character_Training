import BoardElement.Character.CharacterAbstract;

public abstract class AbstractGoku extends CharacterAbstract {
    private int age;
    private int liquidLevel;
    private int solidLevel;
    private int starveLevel;
    private int fatigueLevel;
    private int happinessLevel;
    private int mentalHealth; //sad y happy?
    private int fitnessLevel;
    private int speed;
    private IStateListing healthStates;
    private IStrategyListing behaviours;
    private IStrategyListing sicknesses;
}
