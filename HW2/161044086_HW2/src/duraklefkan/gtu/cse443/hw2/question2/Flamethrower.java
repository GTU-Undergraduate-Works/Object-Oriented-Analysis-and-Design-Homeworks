package duraklefkan.gtu.cse443.hw2.question2;

/**
 * Class to represent Flamethrower accesor.
 */
public class Flamethrower extends Accessories {

    Suit suit;

    /**
     * Creates Flamethrower object
     * @param suit suit to decorate
     */
    public Flamethrower(Suit suit) {
        this.suit = suit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return suit.getDescription() + ", Flamethrower";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 50.0 + suit.cost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double weight() {
        return 2.0 + suit.weight();
    }
}
