package duraklefkan.gtu.cse443.hw2.question3.design1;

/**
 * Class to represent Plane.
 */
public abstract class Plane {

    protected int seatNumber;
    protected String skeleton;
    protected String engine;
    protected String purpose;

    /**
     * Gets the purpose of Plane.
     * @return purpose of plane
     */
    public String getPupose() {return purpose;}

    /**
     * Constructs skeleton of plane.
     */
    public void constructSkeleton() {
        System.out.println(skeleton + " skeleton was constructed." );
    }

    /**
     * Places engine to plane.
     */
    public void placeEngine() {
        System.out.println(engine + " engine was placed to plane.");
    }

    /**
     * Places seat to plane.
     */
    public void placeSeats() {
        System.out.println(seatNumber + " seats were placed to plane.");
    }
}

