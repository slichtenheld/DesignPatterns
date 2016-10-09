package HW07.LinkedList;

/**
 * Created by sam on 10/9/16.
 */
public class LinkedListIterator<T> implements Iterator{

    //private LinkedList linkedList;
    private final Node head;
    private Node current;

    public LinkedListIterator(LinkedList linkedList){
        this.head = linkedList.getHead();
        this.current = this.head;
    }

    @Override
    public void reset() { // is this necessary???
        current = head;
    }

    @Override
    public void traverse() { //returns current node, and traverses down one
        if (!isDone())
            current = current.getNext();
    }

    @Override
    public Node next() {
        return current.getNext();
    }

    @Override
    public boolean isDone() {
        return (current.getNext() == null);
    }

    @Override
    public Node currentItem() {
        return current;
    }

}
