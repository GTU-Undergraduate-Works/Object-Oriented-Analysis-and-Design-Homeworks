
package duraklefkan.gtu.cse443.hw4.part1;
/**
 * Class to represent axe state of the finite state machine
 */
public class AxeState implements State {

    FiniteStateMachine finiteStateMachine;

    /**
     * Creates AxeState with specified finite state machine
     * @param finiteStateMachine the finite state machine
     */
    public AxeState(FiniteStateMachine finiteStateMachine) {
        this.finiteStateMachine = finiteStateMachine;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void exercise() {
        System.err.println("You don't need to do exercise.You are in Axe State");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void buyingGPU() {
        System.err.println("You bought GPU. You are in Axe State");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void perseveranceAndHardWork() {
        System.err.println("You don't need preserve and work hard. You are in Axe State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sleep() {
        System.err.println("You can sleep as long as you want.You are in Axe State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void coffeeAndWork() {
        System.err.println("You can drink coffee and work.But,you don't need to work.You are in Axe State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cheating() {
        System.err.println("You don't need cheat.You are in Axe State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void outTillLate() {
        System.err.println("You can stay out till late. You are in Axe State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Axe State";
    }
}
