package duraklefkan.gtu.cse443.hw2.question2;

/**
 * Class to represent Rocket Launcher accessor.
 */
public class RocketLauncher extends Accessories {

    Suit suit;

    /**
     * Creates RocketLauncher object
     * @param suit suit to decorate
     */
    public RocketLauncher(Suit suit) {
        this.suit = suit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return suit.getDescription() + ", RocketLauncher";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 150.0 + suit.cost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double weight() {
        return 7.5 + suit.weight();
    }
}
