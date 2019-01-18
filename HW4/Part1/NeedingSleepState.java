package duraklefkan.gtu.cse443.hw4.part1;

/**
 * Class to represent needing sleep state of the finite state machine
 */
public class NeedingSleepState implements State {

    FiniteStateMachine finiteStateMachine;

    /**
     * Creates NeedingSleepState with specified finite state machine
     * @param finiteStateMachine the finite state machine
     */
    public NeedingSleepState(FiniteStateMachine finiteStateMachine) {
        this.finiteStateMachine = finiteStateMachine;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void exercise() {
        System.err.println("You can not do exercise. You need to sleep.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void buyingGPU() {
        System.err.println("You can not buy GPU. You need to sleep.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void perseveranceAndHardWork() {
        System.err.println("You should not preserve and work hard. You need to sleep.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sleep() {
        System.err.println("You slept enough. You are moving Ready State.");
        finiteStateMachine.setCurrentState(finiteStateMachine.getReadyState());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void coffeeAndWork() {
        System.err.println("You should not drink coffee and work. You need to sleep.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cheating() {
        System.err.println("You can not cheat. You need to sleep");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void outTillLate() {
        System.err.println("You should not stay out till late. You need to sleep.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Needing Sleep State";
    }
}
