import BoardElement.Character.CharacterAbstract;

public abstract class AbstractGoku extends CharacterAbstract {
    private int age;
    private int liquidLevel;
    private int solidLevel;
    private int starveLevel;
    private int fatigueLevel;
    private int happiness;
    private int sadness;
    private int mentalHealth; //sad y happy?
    private int fitness;
    private int fatness;
    private int speed;
    private IHealthStateListing healthStates;
    private IStrategyListing behaviours;
    private IStrategyListing sicknesses;
}
