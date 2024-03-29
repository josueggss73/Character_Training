package StatesAffector.Edibles.Foods;

import BoardElement.IBoardElement;
import Model.AbstractGoku;
import Model.CharacterAffector.CharacterStates.IState;
import Model.StateFactory;
import Model.States;
import Patterns.IPrototype;
import StatesAffector.CureAffector.ICure;
import StatesAffector.Edibles.IEdible;

public class Brocoli  implements IFood, IEdible, ICure {




    @Override
    public IBoardElement cure(IBoardElement boardElement) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void ingest(IBoardElement boardElement) {

    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }

    @Override
    public void interact(IBoardElement iBoardElement) {

    }

    @Override
    public void feed(IBoardElement boardElement) {
        if(boardElement instanceof AbstractGoku){
            StateFactory stateFactory = new StateFactory();
            IState newState= stateFactory.getState(States.FOOD_RESIGNED);
            //
            ((AbstractGoku) boardElement).getStates().addState(newState);
            ((AbstractGoku) boardElement).getStates().deleteState(States.HAPPY);
            ((AbstractGoku) boardElement).getStates().deleteState(States.STARVING);

            //
            int newLiquidLevel = newState.getLiquidLevel();
            ((AbstractGoku) boardElement).sumLiquidLevel(newLiquidLevel);

            int newSolidLevel = newState.getSolidLevel();
            ((AbstractGoku) boardElement).sumSolidLevel(newSolidLevel);

            int newStarveLevel = newState.getStarveLevel();
            ((AbstractGoku) boardElement).sumStarveLevel(newStarveLevel);

            int newThirstLevel = newState.getThirstLevel();
            ((AbstractGoku) boardElement).sumThirstLevel(newThirstLevel);

            int newFatigueLevel = newState.getFatigueLevel();
            ((AbstractGoku) boardElement).sumFatigueLevel(newFatigueLevel);

            int newHappinessLevel = newState.getHappinessLevel();
            ((AbstractGoku) boardElement).sumHappinessLevel(newHappinessLevel);

            int newPhysicalHealth = newState.getPhysicalHealth();
            ((AbstractGoku) boardElement).sumPhysicalHealth(newPhysicalHealth);

            int newMentalHealth = newState.getMentalHealth();
            ((AbstractGoku) boardElement).sumMentalHealth(newMentalHealth);

            int newFitnessLevel = newState.getFitnessLevel();
            ((AbstractGoku) boardElement).sumFitnessLevel(newFitnessLevel);

            int newSpeed = newState.getSpeed();
            ((AbstractGoku) boardElement).sumSpeed(newSpeed);

            int newSicknessProbability = newState.getSicknessProbability();
            ((AbstractGoku) boardElement).sumSicknessProbability(newSicknessProbability);

            int newPhysicalHealthMax = newState.getPhysicalHealthMax();
            ((AbstractGoku) boardElement).sumPhysicalHealthMax(newPhysicalHealthMax);

            int newMentalHealthMax = newState.getMentalHealthMax();
            ((AbstractGoku) boardElement).sumMentalHealthMax(newMentalHealthMax);


        }
    }
}
