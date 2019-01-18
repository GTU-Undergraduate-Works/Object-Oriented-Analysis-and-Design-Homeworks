package duraklefkan.gtu.cse443.hw2.question3.design2;

import duraklefkan.gtu.cse443.hw2.question3.design1.*;

/**
 * Class to represent Other markets.
 */
public class OtherMarket extends PlaneFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Plane createPlane(ModelType modelType) {

        if (modelType == ModelType.TPX100)
            return new TPX100Other();
        if (modelType == ModelType.TPX200)
            return new TPX200Other();
        if (modelType == ModelType.TPX300)
            return new TPX300Other();
        return null;
    }
}
