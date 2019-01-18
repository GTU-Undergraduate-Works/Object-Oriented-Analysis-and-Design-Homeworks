/**
 * This class represent solution of linear equation
 * by using gaussing elimination method
 * @author efkandurakli
 */
public class SolveWithGaussianElimination implements SolveMethod {


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
    public double[] solve(double[][] A, double[] b) throws ArithmeticException{


        int size = A.length;
        int i = 0,j = 0,k = 0,temp = 0;
        int[] l = new int[size+1];
        double[] s = new double[size];
        double[][] arr = new double[size][size+1];
        double[] x = new double[size];
        double r,rmax,smax,xmult, sum;

        for (i = 0; i < size; i++) {
            arr[i][size] = b[i];
            for (j = 0; j < size; j++)
                arr[i][j] = A[i][j];
        }

        for (i = 0; i < size; i++) {
            l[i] = i;
            smax = 0;
            for (j = 0; j < size; j++) {
                if (Math.abs(arr[i][j]) > smax)
                    smax = Math.abs(arr[i][j]);
            }
            s[i] = smax;
        }
        for (k = 0; k < size-1; k++) {
            rmax = 0;
            for (i = k; i < size; i++) {

                r = Math.abs(arr[l[i]][k]/s[l[i]]);
                if (r > rmax) {
                    rmax = r;
                    j = i;
                }
            }
            temp = l[j];
            l[j] = l[k];
            l[k] = temp;
            for (i = k+1; i < size; i++) {


                xmult = arr[l[i]][k]/arr[l[k]][k];
                arr[l[i]][k] = xmult;
                for (j = k+1; j < size; j++)
                    arr[l[i]][j] = arr[l[i]][j] - (xmult)*arr[l[k]][j];
            }
        }

        for (k = 0; k < size-1; k++) {
            for (i = k+1; i < size; i++)
                b[l[i]] = b[l[i]] - arr[l[i]][k]*b[l[k]];
        }


        if (arr[l[size-1]][size-1] <= EPSILON)
            throw new ArithmeticException("Matrix is singular or nearly singular.");


        x[size-1] = b[l[size-1]]/arr[l[size-1]][size-1];
        for (i = size-2; i >= 0; i--) {
            sum = b[l[i]];
            for (j = i + 1; j < size; j++)
                sum = sum - arr[l[i]][j]*x[j];
            x[i] = sum/arr[l[i]][i];
        }

        return x;
    }
}

