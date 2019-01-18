package duraklefkan.gtu.cse443.hw2.question2;

/**
 * Class to represent Laser accessor.
 */
public class Laser extends Accessories {

    Suit suit;

    /**
     * Creates Laser object
     * @param suit suit to decorate
     */
    public Laser(Suit suit) {
        this.suit = suit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return suit.getDescription() + ", Laser";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 200.0 + suit.cost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double weight() {
        return 5.5 + suit.weight();
    }
}
