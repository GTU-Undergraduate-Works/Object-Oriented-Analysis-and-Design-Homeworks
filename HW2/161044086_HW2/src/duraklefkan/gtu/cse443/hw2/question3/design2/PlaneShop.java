package duraklefkan.gtu.cse443.hw2.question3.design2;

import duraklefkan.gtu.cse443.hw2.question3.design1.ModelType;

/**
 * Class to represent plane shop.
 */
public class PlaneShop {

    PlaneFactory planeFactory;

    /**
     * Creates PlaneShop pbject.
     * @param planeFactory factory of shop
     */
    public PlaneShop(PlaneFactory planeFactory) {
        this.planeFactory = planeFactory;
    }

    /**
     * Produce plane with given type.
     * @param type type of plane
     */
    public void producePlane(ModelType type) {
        planeFactory.producePlane(type);
    }

}
