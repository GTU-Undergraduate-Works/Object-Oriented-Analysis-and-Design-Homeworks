package duraklefkan.gtu.cse443.hw4.part1;
/**
 * Class to represent ready state of the finite state machine
 */
public class ReadyState implements State {

    FiniteStateMachine finiteStateMachine;

    /**
     * Creates ReadyState with specified finite state machine
     * @param finiteStateMachine the finite state machine
     */
    public ReadyState(FiniteStateMachine finiteStateMachine) {
        this.finiteStateMachine = finiteStateMachine;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void exercise() {
        System.err.println("You did do enough exercise. You are moving to Fit State.");
        finiteStateMachine.setCurrentState(finiteStateMachine.getFitState());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void buyingGPU() {
        System.err.println("You have bought GPU. Unable to become a rod for axe.");
        finiteStateMachine.setCurrentState(finiteStateMachine.getAxeState());
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
        System.err.println("You can not sleep. You are already in Ready State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void coffeeAndWork() {
        System.err.println("You can not drink coffee and work.You are already in Ready State.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void cheating() {
        System.err.println("You have cheated. Unable to become a rod for an axe.");
        finiteStateMachine.setCurrentState(finiteStateMachine.getAxeState());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void outTillLate() {
        System.err.println("You need to sleep.So, you should sleep.You are moving to Needing Sleep State.");
        finiteStateMachine.setCurrentState(finiteStateMachine.getNeedingSleep());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "State";
    }
}
