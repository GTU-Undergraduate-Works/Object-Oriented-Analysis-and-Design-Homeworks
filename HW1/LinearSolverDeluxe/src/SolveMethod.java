/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Interface to represent linear equation solution methods.
 * @author efkandurakli
 */
public interface SolveMethod {

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
    double[] solve(double[][] A, double[] b) throws ArithmeticException;

    /**
     * minimum error margin
     */
    double EPSILON = 1e-10;

}

