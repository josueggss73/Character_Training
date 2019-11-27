package Model.CharacterAffector.CharacterStates;

import Model.States;
import Patterns.IPrototype;

public interface IState extends IPrototype<IState> {

    States getName();
    int getAge();
    int getLiquidLevel();
    int getSolidLevel();
    int getStarveLevel();
    int getThirstLevel();
    int getFatigueLevel();
    int getHappinessLevel();
    int getPhysicalHealth();
    int getMentalHealth();
    int getFitnessLevel();
    int getSpeed();
    int getSicknessProbability();
    int getPhysicalHealthMax();
    int getMentalHealthMax();
}
