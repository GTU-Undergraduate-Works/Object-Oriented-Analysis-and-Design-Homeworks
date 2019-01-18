package duraklefkan.gtu.cse443.hw2.question3.design1;

/**
 * Class to represent Plane factory.
 */
public class PlaneFactory {

    /**
     * Creates plane with given type.
     * @param type type of plane
     * @return plane to be created
     */
    public Plane createPlane(ModelType type) {

        Plane plane = null;
        if (type == ModelType.TPX100)
            plane = new TPX100();
        else if (type == ModelType.TPX200)
            plane = new TPX200();
        else if (type == ModelType.TPX300)
            plane = new TPX300();
        return plane;
    }


}
