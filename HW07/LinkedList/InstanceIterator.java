package HW07.LinkedList;

/**
 * Created by Sam on 10/11/2016.
 */
public class InstanceIterator<T> implements Iter<T> {

    private T instance;
    private boolean done = false;

    public InstanceIterator (T instance) {
        this.instance = instance;
    }

    @Override
    public void first() {
        done = false;
    }

    @Override
    public void next() {
        done = true;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public T currentItem() {
        return instance;
    }
}
