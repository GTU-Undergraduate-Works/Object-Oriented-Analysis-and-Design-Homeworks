/**
 * This class represents solution of linear equation
 * by using matrix inversion.
 *
 * @author efkandurakli
 */
public class SolveWithMatrixInversion implements SolveMethod {


    /**
     * This method gets coefficent matrix and
     * equality vector and if solution is exist,
     * return the solution vector.
     *
     * @param A coefficient matrix
     * @param b equality vector
     * @return solution vector of given equation
     * @throws ArithmeticException does not exist solution for given equation
     */
    @Override
    public double[] solve(double[][] A, double[] b) throws ArithmeticException {

        int size = A.length;
        double[][] inverse = new double[0][];
        try {
            inverse = inverse(A);
        } catch (ArithmeticException e) {
            throw e;
        } catch (Exception e) {
            throw new ArithmeticException(e.getMessage());
        }
        double[] x = new double[size];
        double sum = 0.0;

        for (int i = 0; i < size; ++i) {
            sum = 0.0;
            for (int j = 0; j < size; ++j) {
                sum += inverse[i][j]*b[j];
            }
            x[i] = sum;
        }
        return x;
    }



    /**
     * This is helper method that takes a double
     * matrix and returns inverse of matrix if it exits
     * @param a matrix to invert
     * @return inverse of matrix if it exist
     * @throws Exception if inverse does not exist
     */
    private double[][] inverse(double a[][]) throws Exception {
        int size = a.length;
        double x[][] = new double[size][size];
        double b[][] = new double[size][size];
        int index[] = new int[size];
        for (int i = 0; i < size; ++i)
            b[i][i] = 1;

        gaussian(a, index);

        for (int i = 0; i < size - 1; ++i)
            for (int j = i + 1; j < size; ++j)
                for (int k = 0; k < size; ++k)
                    b[index[j]][k] -= a[index[j]][i] * b[index[i]][k];

        for (int i = 0; i < size; ++i) {
            if (a[index[size - 1]][size - 1] <= EPSILON)
                throw new Exception("Matrix is singular or nearly singular");
            x[size - 1][i] = b[index[size - 1]][i] / a[index[size - 1]][size - 1];
            for (int j = size - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < size; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

    /**
     * This is helper method that gets a matrix and
     * @param a matrix to get gaussian elimination
     * @param index index vector
     */
    private void gaussian(double a[][], int index[]) {

        int size = index.length;
        double arr[] = new double[size];

        for (int i = 0; i < size; ++i)
            index[i] = i;
        for (int i = 0; i < size; ++i) {
            double a1 = 0;
            for (int j = 0; j < size; ++j) {
                double a0 = Math.abs(a[i][j]);
                if (a0 > a1)
                    a1 = a0;
            }
            arr[i] = a1;
        }
        int k = 0;
        for (int j = 0; j < size - 1; ++j) {
            double pivot1 = 0;
            for (int i = j; i < size; ++i) {
                double pivot0 = Math.abs(a[index[i]][j]);
                pivot0 /= arr[index[i]];
                if (pivot0 > pivot1) {
                    pivot1 = pivot0;
                    k = i;
                }
            }
            int temp = index[j];
            index[j] = index[k];
            index[k] = temp;
            for (int i = j + 1; i < size; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < size; ++l)
                    a[index[i]][l] -= pj * a[index[j]][l];
            }
        }
    }
}