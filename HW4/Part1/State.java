package duraklefkan.gtu.cse443.hw4.part1;

/**
 * Interface to represent states of finite state machine.
 */
public interface State {

    /**
     * Doing exercises transition function
     */
    void exercise();

    /**
     * Buying GPU transition function
     */
    void buyingGPU();

    /**
     * Perseverance and hard working transition function
     */
    void perseveranceAndHardWork();

    /**
     * Sleeping transition function
     */
    void sleep();


    /**
     * Drinking coffee and working transition function
     */
    void coffeeAndWork();

    /**
     * Cheating transition function
     */
    void cheating();

    /**
     * Out till late transition function
     */
    void outTillLate();

}
