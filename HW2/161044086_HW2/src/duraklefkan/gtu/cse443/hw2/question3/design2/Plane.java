package duraklefkan.gtu.cse443.hw2.question3.design2;

/**
 * Class to represent plane.
 */
public abstract class Plane {

    protected int seatNumber;
    protected String skeleton;
    protected String engine;
    protected String purpose;
    protected String seatCover;
    protected String injectionType;

    /**
     * Gets purpose of plane.
     * @return purpose of plane
     */
    public String getPupose() {return purpose;}

    /**
     * Constructs skeleton of plane.
     */
    public void constructSkeleton() {
        System.out.println(skeleton + " skeleton with " +injectionType + " injection type was constructed." );
    }

    /**
     * Place engine to plane.
     */
    public void placeEngine() {
        System.out.println(engine + " engine with " + injectionType + " injection type was placed to plane.");
    }

    /**
     * Place seats to plane.
     */
    public void placeSeats() {
        System.out.println(seatNumber + " seats with " + seatCover + " cover were placed to plane.");
    }
}
