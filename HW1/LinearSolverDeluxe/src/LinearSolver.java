/**
 * This class represents Linear solver.
 * According to solution method, it
 * can solve linear equation.
 *
 * @author efkandurakli
 */
public class LinearSolver {

    private SolveMethod solveMethod;

    /**
     * Constructor to construct LinearSolver object
     * @param solveMethod solution method
     */
    public LinearSolver(SolveMethod solveMethod) {
        this.solveMethod = solveMethod;
    }


    /**
     * This method gets coefficent matrix and
     * equality vector and if solution is exist,
     * return the solution vector.
     *
     * @param A coefficient matrix
     * @param b equality vector
     * @return solution vector of given equation
     */
    public double[] solve(double[][] A, double[] b){

        return solveMethod.solve(A, b);
    }

}
