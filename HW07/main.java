package HW07;

import HW07.Composite.*;
import HW07.LinkedList.Iter;
import HW07.LinkedList.LinkedList;
import HW07.LinkedList.LinkedListIterator;
import HW07.LinkedList.Node;

/**
 * Created by sam on 10/9/16.
 */
public class main {

    public static void main(String[] args){
//        daveTest();
//        compositeListTest();
//        compositeArrayTest();
        compositeInstanceTEST();
//        linkedListTest();
    }

    public static void daveTest(){
//        Composite lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
//        Composite ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
//        System.out.println(ac.toString());
    }

    public static void compositeListTest(){
        LinkedComposite l = new LinkedComposite(new Leaf(), new Leaf(), new Leaf());
        LinkedComposite ll = new LinkedComposite(new Leaf(), new Leaf(), new Leaf());
        LinkedComposite lll = new LinkedComposite(l,ll);
        lll.remove(l);
        Leaf c = new Leaf();
        InstanceComposite test = new InstanceComposite(c);
        lll.add(test);
        for (Iter iter = lll.makeIterator(); !iter.isDone(); iter.next())
            System.out.println(iter.currentItem());
    }

    public static void compositeArrayTest(){
        Leaf l = new Leaf();
        InstanceComposite c = new InstanceComposite(l);
        ArrayComposite arrayComposite = new ArrayComposite(new Leaf(), new Leaf(), c);
        ArrayComposite arrayComposite2 = new ArrayComposite(new Leaf(), new Leaf(), new Leaf());

        ArrayComposite three = new ArrayComposite(arrayComposite, arrayComposite2);
        three.remove(arrayComposite2);
        three.remove(arrayComposite);
        three.add(arrayComposite2);
        three.add(arrayComposite);
        System.out.println(l.toString());

        for (Iter iter = three.makeIterator(); !iter.isDone(); iter.next())
            System.out.println(iter.currentItem());
    }

    public static void compositeInstanceTEST() {
        Leaf test = new Leaf();
        Leaf l = new Leaf();
        InstanceComposite i2 = new InstanceComposite(test);
        InstanceComposite i3 = new InstanceComposite(i2);
        InstanceComposite i = new InstanceComposite(i3);
        i2.remove(test);
        i2.add(l);
        //System.out.println(instanceComposite3.toString() );
        //System.out.println( instanceComposite2.toString() );

        // FIXME: INSTANCE ITERATOR
        System.out.println(test);
        for (Iter iter = i2.makeIterator(); !iter.isDone(); iter.next())
            System.out.println(iter.currentItem());
    }

    public static void linkedListTest(){
        LinkedList<String> linkedList = new LinkedList();

        //Node this_ = new Node();
        //Node is_ = new Node();
        //Node a_ = new Node();
        //Node test_ = new Node();
        linkedList.append("This ");
        linkedList.append("is ");
        linkedList.append("a ");
        linkedList.append("test. ");

        linkedList.remove("test. "); // FIXME: bug last one not getting removed
        //linkedList.remove(test_);
        linkedList.append("tsetsdf");

        //LinkedListIterator iter2 = new LinkedListIterator(linkedList);

        for ( LinkedListIterator iter2 = new LinkedListIterator(linkedList);
                !iter2.isDone(); iter2.next()) {
            System.out.print(iter2.currentItem());
        }
    }
}
