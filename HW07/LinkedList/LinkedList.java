package HW07.LinkedList;

/**
 * Created by Sam on 10/9/2016.
 */
public class LinkedList<T> {

    private Node<T> head = null;

    public Iter createIterator() {
        return new LinkedListIterator<T>(this);
    }

    public void append(T t) {
        if (head==null){
            head = new Node<T>(t);
        }
        else {
            Node<T> temp = head;
            while ( temp.getNext()!=null ) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<T>(t));
        }
    }

    public void remove(T t) {

        if (head.returnData() == t) {
            head = head.getNext();
        } else {
            Node temp = head;
            while ( temp.getNext() != null ) {
                if ( temp.getNext().returnData() == t ) {
                    temp.setNext(temp.getNext().getNext());
                }
                else temp = temp.getNext();
            }
        }
    }

    public Node getHead() {
        return head;
    }

}
