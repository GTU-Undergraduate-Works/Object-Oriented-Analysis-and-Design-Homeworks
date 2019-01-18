
package duraklefkan.gtu.cse443.hw4.part1;
/**
 * Class to represent finite state machine.
 */
public class FiniteStateMachine {

    private State readyState;
    private State fitState;
    private State chronicIlness;
    private State needingSleep;
    private State graduateState;
    private State axeState;
    private State currentState = readyState;


    /**
     * Creates FiniteStateMachine
     */
    public FiniteStateMachine() {
        readyState = new ReadyState(this);
        fitState = new FitState(this);
        chronicIlness = new ChronicIllness(this);
        needingSleep = new NeedingSleepState(this);
        graduateState = new GraduateState(this);
        axeState = new AxeState(this);
        currentState = readyState;
    }

    /**
     * {@inheritDoc}
     */
    public void exercise(){
        currentState.exercise();
    }

    /**
     * {@inheritDoc}
     */
    public void buyingGPU(){
        currentState.buyingGPU();
    }

    /**
     * {@inheritDoc}
     */
    public void perseveranceAndHardWork(){
        currentState.perseveranceAndHardWork();
    }

    /**
     * {@inheritDoc}
     */
    public void sleep(){
        currentState.sleep();
    }

    /**
     * {@inheritDoc}
     */
    public void coffeeAndWork(){
        currentState.coffeeAndWork();
    }

    /**
     * {@inheritDoc}
     */
    public void cheating(){
        currentState.cheating();
    }

    /**
     * {@inheritDoc}
     */
    public void outTillLate(){
        currentState.outTillLate();
    }

    /**
     * This is setter which sets current state of this object
     * @param state the state to set
     */
    void setCurrentState(State state) {
        this.currentState = state;
    }

    /**
     * This is getter which gets the ready state of this object
     * @return ready state of this object
     */
    public State getReadyState() {
        return readyState;
    }

    /**
     * This is getter which gets the fit state of this object
     * @return fit state of this object
     */
    public State getFitState() {
        return fitState;
    }

    /**
     * This is getter which gets the chronic illness state of this object
     * @return chronic illness state of this object
     */
    public State getChronicIllness() {
        return chronicIlness;
    }

    /**
     * This is getter which gets the needing sleep state of this object
     * @return needing sleep state of this object
     */
    public State getNeedingSleep() {
        return needingSleep;
    }

    /**
     * This is the getter which gets the current state of this object
     * @return current state of this object
     */
    public State getCurrentState() {
        return currentState;
    }

    /**
     * This is getter which gets the graduate state of this object
     * @return graduate state of this object
     */
    public State getGraduateState() {
        return graduateState;
    }

    /**
     * This is getter which gets the axe state of this object
     * @return axe state of this object
     */
    public State getAxeState() {
        return axeState;
    }
}
