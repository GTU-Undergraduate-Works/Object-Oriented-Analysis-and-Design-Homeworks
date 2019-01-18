
package duraklefkan.gtu.cse443.hw4.part1;
/**
 * Class to represent fit state of the finite state machine
 */
public class FitState implements State {

    FiniteStateMachine finiteStateMachine;

    /**
     * Creates FitState with specified finite state machine
     * @param finiteStateMachine the finite state machine
     */
    public FitState(FiniteStateMachine finiteStateMachine) {
        this.finiteStateMachine = finiteStateMachine;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void exercise() {
        System.err.println("You don't need to do exercise. You are in Fit State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void buyingGPU() {
        System.err.println("You can not buy GPU. You are in Fit State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void perseveranceAndHardWork() {
        System.err.println("You preserved and worked hard. You have graduated.Congratulations.");
        finiteStateMachine.setCurrentState(finiteStateMachine.getGraduateState());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sleep() {
        System.err.println("You can not sleep. You are in Fit State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void coffeeAndWork() {
        System.err.println("You can not drink coffee and work. You are in Fit State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cheating() {
        System.err.println("You can not cheat. You are in Fit State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void outTillLate() {
        System.err.println("You can not stay out till late. You are in Fit State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Fit State";
    }

}
