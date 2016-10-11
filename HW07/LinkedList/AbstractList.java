package HW07.LinkedList;

/**
 * Created by sam on 10/9/16.
 */
public interface AbstractList {

    Iter createIterator();
    void append(Node node);
    void remove(Node node);
    Node getHead();
}
