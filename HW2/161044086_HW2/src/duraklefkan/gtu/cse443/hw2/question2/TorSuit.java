package duraklefkan.gtu.cse443.hw2.question2;

/**
 * Class to represent Tor Suit.
 */
public class TorSuit extends Suit {

    /**
     * {@inheritDoc}
     */
    public TorSuit() {
        description = "Ora Suit";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 5000.0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double weight() {
        return 50.0;
    }
}
