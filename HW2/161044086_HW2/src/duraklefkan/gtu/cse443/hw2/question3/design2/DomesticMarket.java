package duraklefkan.gtu.cse443.hw2.question3.design2;

import duraklefkan.gtu.cse443.hw2.question3.design1.*;

/**
 * Class to represent Domestic market.
 */
public class DomesticMarket extends PlaneFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Plane createPlane(ModelType modelType) {

        if (modelType == ModelType.TPX100)
            return new TPX100Domestic();
        if (modelType == ModelType.TPX200)
            return new TPX200Domestic();
        if (modelType == ModelType.TPX300)
            return new TPX300Domestic();

        return null;
    }
}
