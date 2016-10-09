package HW07.LinkedList;

/**
 * Created by Sam on 10/9/2016.
 */
public class LinkedList<T> implements AbstractList{

    private Node<T> head = null;
    private Node<T> tail = null;
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
            tail = node;
        }
        else {
            tail.setNext(node);
            tail = node;
        }
        countInc();
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
                } else iter.traverse();
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
