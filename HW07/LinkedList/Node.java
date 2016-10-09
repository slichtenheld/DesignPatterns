package HW07.LinkedList;

/**
 * Created by Sam on 10/9/2016.
 */
public class Node<T> {

    private Node<T> next;
    private T t;

    public Node(T t) {
        this.t = t;
        this.next = null;
    }

    public void setNext(Node<T> node){
        this.next = node;
    }

    public Node<T> getNext(){
        return next;
    }

    public T returnData() {
        return t;
    }

}
