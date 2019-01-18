package duraklefkan.gtu.cse443.hw3.question3;

public interface Iterator {

    /**
     * Check the iterator has next element.
     * @return if iterator has next element return true
     * if not return false
     */
    boolean hasNext();

    /**
     * Gets the next element of iterator.
     * @return next element of iterator
     */
    Object next();
}
