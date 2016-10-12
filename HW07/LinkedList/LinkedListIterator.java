package HW07.LinkedList;

/**
 * Created by sam on 10/9/16.
 */
public class LinkedListIterator<T> implements Iter<T> {

    private LinkedList<T> linkedList;
    private final Node<T> head;
    private Node<T> current;

    public LinkedListIterator(LinkedList linkedList){
        this.head = linkedList.getHead();
        first();
    }

    @Override
    public void first() {
        current = this.head;
    }

    @Override
    public void next() { //returns current node, and traverses down one
        if (!isDone())
            current = current.getNext();
    }

    @Override
    public boolean isDone() {
        return (current == null);
    }

    @Override
    public T currentItem() {
        return current.returnData();
    }

}
