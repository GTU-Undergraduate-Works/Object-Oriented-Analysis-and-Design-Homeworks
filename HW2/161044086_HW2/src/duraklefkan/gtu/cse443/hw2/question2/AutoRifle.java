package duraklefkan.gtu.cse443.hw2.question2;

/**
 * Class to represent Auto rifle accessor.
 */
public class AutoRifle extends Accessories {

    private Suit suit;

    /**
     * Creates AutoRifle object
     * @param suit suit to decorate
     */
    public AutoRifle(Suit suit) {
        this.suit = suit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return suit.getDescription() + ", AutoRifle";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 30.0 + suit.cost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double weight() {
        return 1.5 + suit.weight();
    }
}
