package duraklefkan.gtu.cse443.hw4.part1;

public class GraduateState implements State {

    FiniteStateMachine finiteStateMachine;

    public GraduateState(FiniteStateMachine finiteStateMachine) {
        this.finiteStateMachine = finiteStateMachine;
    }


    @Override
    public void exercise() {
        System.err.println("You don't need to do exercise. You have graduated.");
    }

    @Override
    public void buyingGPU() {
        System.err.println("You can buy GPU. You have graduated.");
    }

    @Override
    public void perseveranceAndHardWork() {
        System.err.println("You don't need to preserve and work hard. You have graduated.");
    }

    @Override
    public void sleep() {
        System.err.println("You can sleep. You have graduated.");
    }

    @Override
    public void coffeeAndWork() {
        System.err.println("You can drink coffee and work. But, you should not. You have graduated");
    }

    @Override
    public void cheating() {
        System.err.println("You don't need to cheat. You have graduated.");
    }

    @Override
    public void outTillLate() {
        System.err.println("You can stay out till late. You have graduated.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Graduate State";
    }
}
