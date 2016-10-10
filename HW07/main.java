package HW07;

import HW07.Composite.*;
import HW07.LinkedList.LinkedList;
import HW07.LinkedList.LinkedListIterator;
import HW07.LinkedList.Node;

/**
 * Created by sam on 10/9/16.
 */
public class main {

    public static void main(String[] args){
        daveTest();
    }

    public static void daveTest(){
        Component lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
        Component ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
        System.out.print(ac.toString());
    }

    public static void compositeListTest(){
        LinkedComposite l = new LinkedComposite(new Leaf("H"), new Leaf("I"), new Leaf("J"));
        LinkedComposite ll = new LinkedComposite(new Leaf("K"), new Leaf("L"), new Leaf("M"));
        LinkedComposite lll = new LinkedComposite(l,ll);
        System.out.print(lll);
    }

    public static void compositeArrayTest(){
        InstanceComposite c = new InstanceComposite(new Leaf("C"));
        ArrayComposite arrayComposite = new ArrayComposite(new Leaf("A"), new Leaf("B"), c);
        ArrayComposite arrayComposite2 = new ArrayComposite(new Leaf("D"), new Leaf("E"), new Leaf("F"));

        //ArrayComposite compositeArray3 = new ArrayComposite(arrayComposite, arrayComposite2);
        System.out.print(arrayComposite.toString());
        arrayComposite.printParent();
    }

    public static void compositeInstanceTEST() {
        InstanceComposite instanceComposite2 = new InstanceComposite(new Leaf("C"));
        InstanceComposite instanceComposite3 = new InstanceComposite(instanceComposite2);
        InstanceComposite instanceComposite = new InstanceComposite(instanceComposite3);
        System.out.print( instanceComposite.toString() );
    }
    public static void linkedListTest(){
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
