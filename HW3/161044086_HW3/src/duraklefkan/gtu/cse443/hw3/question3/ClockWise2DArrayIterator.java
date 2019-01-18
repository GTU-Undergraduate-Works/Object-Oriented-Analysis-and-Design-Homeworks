package duraklefkan.gtu.cse443.hw3.question3;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Class to iterate integer 2d elements by clock-wise order.
 * @author Efkan Durakli
 */
public class ClockWise2DArrayIterator implements Iterator {


    private ListIterator<Integer> clockwiseIterator;

    /**
     * Constructs iterator object with given 2d array.
     * @param elements 2d integer array
     */
    public ClockWise2DArrayIterator(int[][] elements) {

        int height = elements.length;
        int width = elements[0].length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        iterate(elements, 0, height-1, 0, width-1, arrayList);
        clockwiseIterator = arrayList.listIterator();
    }

    /**
     * {@inheritDoc}
     */

    @Override
    public boolean hasNext() {
        return clockwiseIterator.hasNext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object next() {
        return clockwiseIterator.next();
    }

    /**
     * Private helper method, iterates the array and add the elements
     * given array list.
     * @param arr 2d array to iterate
     * @param top top index of 2d array
     * @param bottom bottom index of 2d array
     * @param left left index of 2d array
     * @param right right index of 2d array
     * @param arrayList array list to add elements
     */
    private void iterate(int[][] arr, int top, int bottom, int left, int right, ArrayList<Integer> arrayList) {

        if (left == right && top == bottom)
            arrayList.add(arr[top][left]);
        else if (left == right) {
            for (int i = top; i <= bottom; ++i )
                arrayList.add(arr[i][left]);
        }
        else if (top == bottom) {
            for (int i = left; i <= right; ++i )
                arrayList.add(arr[top][i]);
        } else if (top < bottom && left < right){

            for (int i = left; i <= right; ++i)
                arrayList.add(arr[top][i]);
            for (int i = top+1; i <= bottom; ++i)
                arrayList.add(arr[i][right]);
            for (int i = right-1; i >= left; --i)
                arrayList.add(arr[bottom][i]);
            for (int i = bottom-1; i >= top+1; --i)
                arrayList.add(arr[i][left]);

            iterate(arr, top+1, bottom-1, left+1, right-1, arrayList);
        }

    }
}
