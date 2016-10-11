package HW07.LinkedList;

/**
 * Created by Sam on 10/9/2016.
 */
public class LinkedList<S> implements AbstractList{

    private Node<S> head = null;

    @Override
    public Iter createIterator() {
        return new LinkedListIterator<S>(this);
    }

    @Override
    public void append(Node node) {
        if (head==null){
            head = node;
        }
        else {
            Iter<Node> iter = createIterator();
            while ( !iter.isDone() ) {
                iter.next();
            }
            iter.currentItem().setNext(node);
        }
    }

    @Override
    public void remove(Node node) {

        if (head == node) {
            head = head.getNext();
        } else {
            Iter<Node> iter = createIterator();
            do {
                Node temp = iter.currentItem();
                iter.next();
                if (iter.currentItem() == node) {
                    iter.next();
                    temp.setNext(iter.currentItem());
                }
            } while (!iter.isDone());
        }
    }

    @Override
    public Node getHead() {
        return head;
    }

//    public boolean remove(T data) { // returns true if successful
//        if (head.returnData() == data) { // if nodes component equals passed in component
//            remove(head);
//            return true;
//        }
//        else {
//            Iter iter = createIterator(); // iterate through list and remove if data matches
//            while (!iter.isDone()) {
//                if (iter.next().returnData() == data) {
//                    remove(iter.next());
//                    return true;
//                } else iter.traverse();
//            }
//            return false;
//        }
//    }
}
