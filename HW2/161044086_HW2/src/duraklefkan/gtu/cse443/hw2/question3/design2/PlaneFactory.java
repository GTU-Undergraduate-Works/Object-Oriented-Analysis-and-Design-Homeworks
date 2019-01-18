package duraklefkan.gtu.cse443.hw2.question3.design2;

import duraklefkan.gtu.cse443.hw2.question3.design1.*;

/**
 * Class to represent Plane Factory.
 */
public abstract class PlaneFactory {

    /**
     * Produces plane with given type.
     * @param modelType type of plane
     * @return plane to be produced
     */
    public Plane producePlane(ModelType modelType) {

        Plane plane;

        plane = createPlane(modelType);

        plane.constructSkeleton();
        plane.placeEngine();
        plane.placeSeats();

        return plane;
    }

    /**
     * Creates plane with given type.
     * @param modelType type of plane
     * @return plane to created
     */
    public abstract Plane  createPlane(ModelType modelType);

}
