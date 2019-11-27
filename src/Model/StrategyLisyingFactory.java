package Model;

import Model.CharacterAffector.IStrategyListing;
import Model.CharacterAffector.StrategyArray;

public class StrategyLisyingFactory {
    public IStrategyListing getStrategyListing(StrategyListings strategyListing){
        switch (strategyListing){
            case ARRAY:
                return new StrategyArray();
        }
        //if(strategyListing.equals(StrategyListing.loquesea)
        return null;
    }
}
