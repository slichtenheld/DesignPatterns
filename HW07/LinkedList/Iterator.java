package HW07.LinkedList;

/**
 * Created by sam on 10/9/16.
 */
public interface Iterator {

    void reset();
    void traverse();
    Node next();
    boolean isDone();
    Node currentItem();
}
