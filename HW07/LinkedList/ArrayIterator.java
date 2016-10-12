package HW07.LinkedList;

/**
 * Created by Sam on 10/11/2016.
 */
public class ArrayIterator<T> implements Iter<T> {

    private T[] array;
    private int currentLoc;

    public ArrayIterator (T[] array) {
        this.array = array;
        first();
    }

    @Override
    public void first() {
         currentLoc = 0;
    }

    @Override
    public void next() {
        if (currentLoc < array.length -1) {
            currentLoc++;
        }
    }

    @Override
    public boolean isDone() {
        if (currentLoc >= array.length -1) {
            return true;
        }
        return false;
    }

    @Override
    public T currentItem() {
        return array[currentLoc];
    }

}
