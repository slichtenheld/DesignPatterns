package HW07.LinkedList;

/**
 * Created by sam on 10/9/16.
 */
public interface AbstractList {

    Iterator createIterator();
    int getCount();
    void append(Node node);
    void remove(Node node);
    Node getHead();
}
