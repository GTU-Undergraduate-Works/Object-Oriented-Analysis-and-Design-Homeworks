package duraklefkan.gtu.cse443.hw3.question4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Abstract class to represent discrete transformation process.
 * @author Efkan Durakli
 */
public abstract class DiscreteTransform {

    private long currentExecutionTime = 0;

    /**
     * Reads input from file to 1d array.
     * @param fileName name of input file
     * @return 1d input array
     */
    double[] readInputFromFile(String fileName) {

        try {
            Scanner scanner = new Scanner(new File(fileName));
            ArrayList<Double> arrayList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if (!str.equals(""))
                    arrayList.add(Double.parseDouble(str));
            }
            double[] arr = new double[arrayList.size()];
            for (int i = 0; i < arrayList.size(); ++i)
                arr[i] = arrayList.get(i);


            System.out.println(arr.length);

            return arr;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Calculate transformation of given 1d array.
     * @param input input array to calculate transformation
     * @return result of transformation
     */
    abstract Complex[] calculateTransform(double[] input);


    /**
     * Writes given 1d complex array to given file.
     * @param output output array to write file
     * @param fileName name of file
     */
    void writeOutputToFile(Complex[] output, String fileName) {
        try {
            Writer fileWriter = new BufferedWriter(new FileWriter("Outputs" + File.separator + fileName));

            for (int i = 0; i < output.length; ++i)
                fileWriter.write(output[i] + System.getProperty("line.separator"));

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads input from given input file, calculates transformation.
     * and writes result to given file
     * @param inputFileName name of input file
     * @param outputFilename name of output file
     */
    void completeTransformationProcess(String inputFileName, String outputFilename) {
        long startTime = System.nanoTime();
        double[] input = readInputFromFile(inputFileName);
        Complex[] output = calculateTransform(input);
        writeOutputToFile(output, outputFilename);
        long endTime = System.nanoTime();
        currentExecutionTime = (endTime - startTime)/1000000;
    }

    /**
     * Gets execution time of last transformation process.
     * @return execution time of last transformation process
     */
    public long getCurrentExecutionTime() {
        return currentExecutionTime;
    }

    /**
     * Prints result of execution time of transformation process.
     * Does nothing by default.
     */
    void printTransformationOutput() {}
}
