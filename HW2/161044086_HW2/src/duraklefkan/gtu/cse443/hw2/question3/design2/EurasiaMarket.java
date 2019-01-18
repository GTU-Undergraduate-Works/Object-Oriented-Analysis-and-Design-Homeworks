package duraklefkan.gtu.cse443.hw2.question3.design2;

import duraklefkan.gtu.cse443.hw2.question3.design1.*;

/**
 * Class to represent Eurasian market.
 */
public class EurasiaMarket extends PlaneFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Plane createPlane(ModelType modelType) {

        if (modelType == ModelType.TPX100)
            return new TPX100Eurasian();
        if (modelType == ModelType.TPX200)
            return new TPX200Eurasian();
        if (modelType == modelType.TPX300)
            return new TPX300Eurasian();
        return null;
    }
}
