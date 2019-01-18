package duraklefkan.gtu.cse443.hw2.question2;

/**
 * Class to represent Dec suit.
 */
public class DecSuit extends Suit {

    /**
     * Creates duraklefkan.gtu.cse443.hw2.question2.DecSuit object
     */
    public DecSuit() {
        description = "Suit";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 500.0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double weight() {
        return 25.0;
    }
}
