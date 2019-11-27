package Model;

import BoardElement.Character.CharacterAbstract;
import BoardElement.IBoardElement;
import BoardElement.Tools.IToolListing;
import Media.IMediaListing;
import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.IStrategyListing;
import StatesAffector.CureAffector.ICure;

public abstract class AbstractGoku extends CharacterAbstract {
    private int age;
    private int liquidLevel;
    private int solidLevel;
    private int starveLevel;
    private int thirstLevel;
    private int fatigueLevel;
    private int happinessLevel;
    private int physicalHealth;
    private int mentalHealth;
    private int fitnessLevel;
    private int speed;
    private int sicknessProbability;

    private IStateListing states;
    private IStrategyListing behaviours;
    private IStrategyListing sicknesses;

    private int physicalHealthMax;
    private int mentalHealthMax;

    private AbstractGoku currentEnemy;
    private ICure currentCure;

    public AbstractGoku(String name, float defaultLife, IToolListing tools, IMediaListing media, int age, int liquidLevel, int solidLevel, int starveLevel, int thirstLevel, int fatigueLevel, int happinessLevel, int physicalHealth, int mentalHealth, int fitnessLevel, int speed, int sicknessProbability, int physicalHealthMax, int mentalHealthMax) {
        super(name, defaultLife, tools, media);
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
        this.sicknessProbability = sicknessProbability;
        this.physicalHealthMax = physicalHealthMax;
        this.mentalHealthMax = mentalHealthMax;
    }

    @Override
    public void interact(IBoardElement otherElement) {
        //aqui se haria el case segun el tipo de elemento que venga de parametro
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLiquidLevel() {
        return liquidLevel;
    }

    public void setLiquidLevel(int liquidLevel) {
        this.liquidLevel = liquidLevel;
    }

    public int getSolidLevel() {
        return solidLevel;
    }

    public void setSolidLevel(int solidLevel) {
        this.solidLevel = solidLevel;
    }

    public int getStarveLevel() {
        return starveLevel;
    }

    public void setStarveLevel(int starveLevel) {
        this.starveLevel = starveLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public int getFatigueLevel() {
        return fatigueLevel;
    }

    public void setFatigueLevel(int fatigueLevel) {
        this.fatigueLevel = fatigueLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getPhysicalHealth() {
        return physicalHealth;
    }

    public void setPhysicalHealth(int physicalHealth) {
        this.physicalHealth = physicalHealth;
    }

    public int getMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(int mentalHealth) {
        this.mentalHealth = mentalHealth;
    }

    public int getFitnessLevel() {
        return fitnessLevel;
    }

    public void setFitnessLevel(int fitnessLevel) {
        this.fitnessLevel = fitnessLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public IStateListing getStates() {
        return states;
    }

    public void setStates(IStateListing states) {
        this.states = states;
    }

    public IStrategyListing getBehaviours() {
        return behaviours;
    }

    public void setBehaviours(IStrategyListing behaviours) {
        this.behaviours = behaviours;
    }

    public IStrategyListing getSicknesses() {
        return sicknesses;
    }

    public void setSicknesses(IStrategyListing sicknesses) {
        this.sicknesses = sicknesses;
    }

    public int getSicknessProbability() {
        return sicknessProbability;
    }

    public void setSicknessProbability(int sicknessProbability) {
        this.sicknessProbability = sicknessProbability;
    }

    public int getPhysicalHealthMax() {
        return physicalHealthMax;
    }

    public void setPhysicalHealthMax(int physicalHealthMax) {
        this.physicalHealthMax = physicalHealthMax;
    }

    public int getMentalHealthMax() {
        return mentalHealthMax;
    }

    public void setMentalHealthMax(int mentalHealthMax) {
        this.mentalHealthMax = mentalHealthMax;
    }

    public void sumAge(int newAge){
        if(this.age + newAge >= 100){
            this.age = 100;
        }
        else if(this.age + newAge <= 0){
            this.age = 0;
        }
        else{
            this.age = this.age + newAge;
        }
    };
    public void sumLiquidLevel(int newLiquidLevel){
        if(this.liquidLevel + newLiquidLevel >= 100){
            this.liquidLevel = 100;
        }
        else if(this.liquidLevel + newLiquidLevel <= 0){
            this.liquidLevel = 0;
        }
        else{
            this.liquidLevel = this.liquidLevel + newLiquidLevel;
        }
    };
    public void sumSolidLevel(int newSolidLevel){
        if(this.solidLevel + newSolidLevel >= 100){
            this.solidLevel = 100;
        }
        else if(this.solidLevel + newSolidLevel <= 0){
            this.solidLevel = 0;
        }
        else{
            this.solidLevel = this.solidLevel + newSolidLevel;
        }
    };
    public void sumStarveLevel(int newStarveLevel){
        if(this.starveLevel + newStarveLevel >= 100){
            this.starveLevel = 100;
        }
        else if(this.starveLevel + newStarveLevel <= 0){
            this.starveLevel = 0;
        }
        else{
            this.starveLevel = this.starveLevel + newStarveLevel;
        }
    };
    public void sumThirstLevel(int newThirstLevel){
        if(this.thirstLevel + newThirstLevel >= 100){
            this.thirstLevel = 100;
        }
        else if(this.thirstLevel + newThirstLevel <= 0){
            this.thirstLevel = 0;
        }
        else{
            this.thirstLevel = this.thirstLevel + newThirstLevel;
        }
    };
    public void sumFatigueLevel(int newFatigueLevel){
        if(this.fatigueLevel + newFatigueLevel >= 100){
            this.fatigueLevel = 100;
        }
        else if(this.fatigueLevel + newFatigueLevel <= 0){
            this.fatigueLevel = 0;
        }
        else{
            this.fatigueLevel = this.fatigueLevel + newFatigueLevel;
        }
    };
    public void sumHappinessLevel(int newHappinessLevel){
        if(this.happinessLevel + newHappinessLevel >= 100){
            this.happinessLevel = 100;
        }
        else if(this.happinessLevel + newHappinessLevel <= 0){
            this.happinessLevel = 0;
        }
        else{
            this.happinessLevel = this.happinessLevel + newHappinessLevel;
        }
    };
    public void sumPhysicalHealth(int newPhysicalHealth){
        if(this.physicalHealth + newPhysicalHealth >= 100){
            this.physicalHealth = 100;
        }
        else if(this.physicalHealth + newPhysicalHealth <= 0){
            this.physicalHealth = 0;
        }
        else{
            this.physicalHealth = this.physicalHealth + newPhysicalHealth;
        }
    };
    public void sumMentalHealth(int newMentalHealth){
        if(this.mentalHealth + newMentalHealth >= 100){
            this.mentalHealth = 100;
        }
        else if(this.mentalHealth + newMentalHealth <= 0){
            this.mentalHealth = 0;
        }
        else{
            this.mentalHealth = this.mentalHealth + newMentalHealth;
        }
    };
    public void sumFitnessLevel(int newFitnessLevel){
        if(this.fitnessLevel + newFitnessLevel >= 100){
            this.fitnessLevel = 100;
        }
        else if(this.fitnessLevel + newFitnessLevel <= 0){
            this.fitnessLevel = 0;
        }
        else{
            this.fitnessLevel = this.fitnessLevel + newFitnessLevel;
        }
    };

    public void sumSpeed(int newSpeed){
        if(this.speed + newSpeed >= 100){
            this.speed = 100;
        }
        else if(this.speed + newSpeed <= 0){
            this.speed = 0;
        }
        else{
            this.speed = this.speed + newSpeed;
        }
    };

    public void sumSicknessProbability(int newSicknessProbability){
        if(this.sicknessProbability + newSicknessProbability >= 100){
            this.sicknessProbability = 100;
        }
        else if(this.sicknessProbability + newSicknessProbability <= 0){
            this.sicknessProbability = 0;
        }
        else{
            this.sicknessProbability = this.sicknessProbability + newSicknessProbability;
        }
    };

    public void sumPhysicalHealthMax(int newPhysicalHealthMax){
        if(this.physicalHealthMax + newPhysicalHealthMax >= 100){
            this.physicalHealthMax = 100;
        }
        else if(this.physicalHealthMax + newPhysicalHealthMax <= 0){
            this.physicalHealthMax = 0;
        }
        else{
            this.physicalHealthMax = this.physicalHealthMax + newPhysicalHealthMax;
        }
    };

    public void sumMentalHealthMax(int newMentalHealthMax){
        if(this.mentalHealthMax + newMentalHealthMax >= 100){
            this.mentalHealthMax = 100;
        }
        else if(this.mentalHealthMax + newMentalHealthMax <= 0){
            this.mentalHealthMax = 0;
        }
        else{
            this.mentalHealthMax = this.mentalHealthMax + newMentalHealthMax;
        }
    }

    public void endDay(){
        sumLiquidLevel(5);
        sumSolidLevel(5);
        sumStarveLevel(10);
        sumThirstLevel(10);
        sumFatigueLevel(50);
    }
}
