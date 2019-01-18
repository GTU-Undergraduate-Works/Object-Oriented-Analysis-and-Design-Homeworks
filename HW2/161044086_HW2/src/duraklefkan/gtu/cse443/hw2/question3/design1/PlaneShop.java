package duraklefkan.gtu.cse443.hw2.question3.design1;

/**
 * Class to represents Plane shop.
 */
public class PlaneShop {

    PlaneFactory factory;

    /**
     * Creates PlaneShop object.
     * @param factory factory to create PlaneShop
     */
    public PlaneShop(PlaneFactory factory) {
        this.factory = factory;
    }

    /**
     * Produce plane with given type.
     * @param type type of plane
     * @return plane to be produced
     */
    public Plane producePlane(ModelType type) {
        Plane plane;
        plane = factory.createPlane(type);
        plane.constructSkeleton();
        plane.placeEngine();
        plane.placeSeats();

        return plane;
    }
}
