package HW07;

import HW07.LinkedList.LinkedList;
import HW07.LinkedList.LinkedListIterator;
import HW07.LinkedList.Node;

/**
 * Created by sam on 10/9/16.
 */
public class main {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        linkedList.append(new Node("This "));
        linkedList.append(new Node("is "));
        linkedList.append(new Node("a "));
        linkedList.append(new Node("test. "));

        LinkedListIterator iter = new LinkedListIterator(linkedList);
        if (iter.currentItem().returnData() == "is "){
            linkedList.remove(iter.currentItem());
            System.out.println("****");
        }
        do {
            iter.traverse();
            if (iter.currentItem().returnData() == "is "){
                linkedList.remove(iter.currentItem());
                System.out.println("****");
            }
        } while (!iter.isDone());


        LinkedListIterator iter2 = new LinkedListIterator(linkedList);
        System.out.print(iter2.currentItem().returnData());
        do {
            iter2.traverse();
            System.out.print(iter2.currentItem().returnData());
        } while (!iter2.isDone());
    }


}
