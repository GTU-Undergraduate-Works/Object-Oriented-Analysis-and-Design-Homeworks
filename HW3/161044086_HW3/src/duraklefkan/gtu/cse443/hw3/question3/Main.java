package duraklefkan.gtu.cse443.hw3.question3;

/**
 * Main class to test iterator class.
 */
public class Main {

    /**
     * main method
     * @param args main arguments
     */
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4,5,6,7,8,9},
                {11,12,13,14,15,16,17,18,19},
                {21,22,23,24,25,26,27,28,29},
                {31,32,33,34,35,36,37,38,39},
                {41,42,43,44,45,46,47,48,49}};

        Iterator iterator = new ClockWise2DArrayIterator(arr);
        System.out.println("Elements of Array by clock-wise order :");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() +", ");
        }
        System.out.println();
    }

}
