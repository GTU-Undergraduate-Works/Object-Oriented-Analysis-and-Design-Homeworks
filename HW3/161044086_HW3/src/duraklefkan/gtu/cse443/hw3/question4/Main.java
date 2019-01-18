package duraklefkan.gtu.cse443.hw3.question4;

/**
 * Main class to test Discrete Transformation Process.
 */
public class Main {

    /**
     * main method
     * @param args main arguments
     */
    public static void main(String[] args) {
        DiscreteTransform fourierTransform = new DiscreteFourierTransform();
        DiscreteTransform cosineTransform = new DiscreteCosineTransform();
        fourierTransform.completeTransformationProcess("Inputs/input1", "output_dft");
        fourierTransform.printTransformationOutput();
        cosineTransform.completeTransformationProcess("Inputs/input1", "output_dct");
    }
}
