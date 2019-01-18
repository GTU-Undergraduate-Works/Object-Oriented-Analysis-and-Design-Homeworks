package duraklefkan.gtu.cse443.hw3.question4;

/**
 * Class to represent Discrete Fourier Transform.
 */
public class DiscreteFourierTransform extends DiscreteTransform {

    /**
     * Calculates Discrete Fourier Transformation of given 1d array.
     * @param input input array to calculate transformation
     * @return discrete fourier transform of given array
     */
    @Override
    Complex[] calculateTransform(double[] input) {

        int size = input.length;
        Complex[] output = new Complex[size];
        for (int i = 0; i < size; ++i) {
            double sumReal = 0;
            double sumImaginary = 0;
            for (int j = 0; j < size; ++j) {
                double radian = (2*Math.PI*i*j)/size;
                sumReal += input[j]*Math.cos(radian);
                sumImaginary += -input[j]*Math.cos(radian);
            }
            output[i] = new Complex(sumReal, sumImaginary);

        }
        return output;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    void printTransformationOutput() {
        System.out.println("Last Execution Time of Fourier Transform : " + getCurrentExecutionTime() + " miliseconds");
    }
}
