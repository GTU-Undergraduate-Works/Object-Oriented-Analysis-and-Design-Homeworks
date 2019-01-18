package duraklefkan.gtu.cse443.hw2.question3.design2;

/**
 * Class to represent Domestic market TPX100 type plane
 */
public class TPX100Domestic extends Plane {

    /**
     * Creates TPX100Domestic object.
     */
    public TPX100Domestic() {
        purpose = "Domestic flights";
        skeleton = "Aluminum alloy";
        engine = "Single jet";
        seatNumber = 50;
        injectionType = "Turbojet";
        seatCover = "Velvet";
    }
}
