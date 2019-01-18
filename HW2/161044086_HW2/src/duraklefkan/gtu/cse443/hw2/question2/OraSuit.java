package duraklefkan.gtu.cse443.hw2.question2;

/**
 * Class to represent Ora suit.
 */
public class OraSuit extends Suit {

    /**
     * Creates OraSuit object
     */
    public OraSuit() {
        description = "Ora Suit";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 1500.0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double weight() {
        return 30.0;
    }
}
