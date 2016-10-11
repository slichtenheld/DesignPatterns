package HW07.LinkedList;

/**
 * Created by sam on 10/9/16.
 */
public interface Iter <T>{

    void first();
    void next();
    boolean isDone();
    T currentItem();
}
