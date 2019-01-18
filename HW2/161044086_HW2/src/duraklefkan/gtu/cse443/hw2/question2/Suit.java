package duraklefkan.gtu.cse443.hw2.question2;

/**
 * Abstract suit class to represent Zirhsan suits.
 */
public abstract class Suit {

    String description = "Unknown Suit";

    /**
     * Get description of this suit
     * @return description of suit.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets cost of this suit
     * @return cost of this suit
     */
    public abstract double cost();


    /**
     * Gets weight of this suit
     * @return weight of this suit
     */
    public abstract double weight();
}
