package duraklefkan.gtu.cse443.hw4.part1;

/**
 * Class to represent chronic illness state of the finite state machine.
 */
public class ChronicIllness implements State {

    FiniteStateMachine finiteStateMachine;

    /**
     * Creates ChronicIllness with specified finite state machine
     * @param finiteStateMachine the finite state machine
     */
    public ChronicIllness(FiniteStateMachine finiteStateMachine) {
        this.finiteStateMachine = finiteStateMachine;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void exercise() {
        System.err.println("You should not do exercise. You have chronic illness.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void buyingGPU() {
        System.err.println("You should not buy GPU. You have chronic illness");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void perseveranceAndHardWork() {
        System.err.println("You should not preserve and work hard. You have chronic illness.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sleep() {
        System.err.println("You can sleep. You have chronic illness.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void coffeeAndWork() {
        System.err.println("You should not drink coffee and work. You have chronic illness.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cheating() {
        System.err.println("You ou don't need to cheat. You have chronic illness.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void outTillLate() {
        System.err.println("You should not stay out till late. You have chronic illness.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Chronic Illness State";
    }
}
