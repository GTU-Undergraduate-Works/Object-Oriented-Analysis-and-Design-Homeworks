package duraklefkan.gtu.cse443.hw3.question4;

/**
 * Class to represent Discrete Cosine Transform.
 */
public class DiscreteCosineTransform extends DiscreteTransform {

    /**
     * Calculates Discrete Cosine Transformation of given 1d array.
     * @param input input array to calculate transformation
     * @return discrete cosine transform of given array
     */
    @Override
    Complex[] calculateTransform(double[] input) {
        int size = input.length;
        Complex[] output = new Complex[size];

        for (int i = 0; i < size; ++i) {
            double sum = 0;
            for (int j = 0; j < size; ++j) {
                double radian = (Math.PI/size)*(j + 0.5)*i  ;
                sum += input[j]*Math.cos(radian);
            }
            output[i] = new Complex(sum, 0);
        }
        return output;
    }


}
