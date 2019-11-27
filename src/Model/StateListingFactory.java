package Model;

import Model.CharacterAffector.IStateListing;
import Model.CharacterAffector.StateArray;

public class StateListingFactory {

    public IStateListing getStateListing(StateListings stateListing){
        //if stateListing.equals(Model.StateListings.loquesea)
        switch (stateListing){
            case ARRAY:
                return new StateArray();
        }
        return null;
    }
}
