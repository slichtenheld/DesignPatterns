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
        compositeListTest();
        compositeArrayTest();
        compositeInstanceTEST();
        linkedListTest();
    }

    public static void daveTest(){
        Component lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
        Component ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
        System.out.println(ac.toString());
    }

    public static void compositeListTest(){
        LinkedComposite l = new LinkedComposite(new Leaf("H"), new Leaf("I"), new Leaf("J"));
        LinkedComposite ll = new LinkedComposite(new Leaf("K"), new Leaf("L"), new Leaf("M"));
        LinkedComposite lll = new LinkedComposite(l,ll);
        lll.remove(l);
        Leaf c = new Leaf("C");
        InstanceComposite test = new InstanceComposite(c);
        lll.add(test);
        System.out.println(lll);
    }

    public static void compositeArrayTest(){
        Leaf l = new Leaf("C");
        InstanceComposite c = new InstanceComposite(l);
        ArrayComposite arrayComposite = new ArrayComposite(new Leaf("A"), new Leaf("B"), c);
        ArrayComposite arrayComposite2 = new ArrayComposite(new Leaf("D"), new Leaf("E"), new Leaf("F"));

        ArrayComposite three = new ArrayComposite(arrayComposite, arrayComposite2);
        three.remove(arrayComposite2);
        three.remove(arrayComposite);
        three.add(arrayComposite2);
        three.add(arrayComposite);
        System.out.println(three.toString());
    }

    public static void compositeInstanceTEST() {
        Leaf test = new Leaf("C");
        Leaf l = new Leaf("Replacement");
        InstanceComposite instanceComposite2 = new InstanceComposite(test);
        InstanceComposite instanceComposite3 = new InstanceComposite(instanceComposite2);
        InstanceComposite instanceComposite = new InstanceComposite(instanceComposite3);
        instanceComposite2.remove(test);
        instanceComposite2.add(l);
        System.out.println( instanceComposite.toString() );
    }
    public static void linkedListTest(){
        LinkedList linkedList = new LinkedList();

        Node this_ = new Node("This ");
        Node is_ = new Node("is ");
        Node a_ = new Node("a ");
        Node test_ = new Node("test. ");
        linkedList.append(this_);
        linkedList.append(is_);
        linkedList.append(a_);
        linkedList.append(test_);

        linkedList.remove(test_);
        linkedList.remove("is ");
        linkedList.append(new Node("tsetsdf"));

        LinkedListIterator iter2 = new LinkedListIterator(linkedList);
        System.out.print(iter2.currentItem().returnData());
        do {
            iter2.traverse();
            System.out.print(iter2.currentItem().returnData());
        } while (!iter2.isDone());
    }
}
