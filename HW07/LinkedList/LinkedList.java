package HW07.LinkedList;

/**
 * Created by Sam on 10/9/2016.
 */
public class LinkedList<T> implements AbstractList{

    private Node<T> head = null;
    int count = 0;

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator<T>(this);
    }

    @Override
    public Node getHead() {
        return head;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void append(Node node) {
        if (head==null){
            head = node;
        }
        else {
            Iterator iter = createIterator();
            while (!iter.isDone()) {
                iter.traverse();
            }
            iter.currentItem().setNext(node);
        }
        countInc();
    }

    public boolean remove(T data) { // returns true if successful
        if (head.returnData() == data) { // if nodes component equals passed in component
            remove(head);
            return true;
        }
        else {
            Iterator iter = createIterator(); // iterate through list and remove if data matches
            while (!iter.isDone()) {
                if (iter.next().returnData() == data) {
                    remove(iter.next());
                    return true;
                } else iter.traverse();
            }
            return false;
        }
    }

    @Override
    public void remove(Node node) {

        if (head == node) {
            head = head.getNext();
            countDec();
        }
        else {
            Iterator iter = createIterator();
            while (!iter.isDone()) {
                if (iter.next() == node) {
                    Node<T> temp = iter.currentItem();
                    iter.traverse();
                    temp.setNext(iter.next());
                    countDec();
                }
                else iter.traverse();
            }
        }
    }

    private void countInc(){
        count++;
    }

    private void countDec(){
        count--;
    }

}
