package HW07.Composite;

import HW07.LinkedList.Iterator;
import HW07.LinkedList.LinkedList;
import HW07.LinkedList.LinkedListIterator;
import HW07.LinkedList.Node;

/**
 * Created by sam on 10/9/16.
 */
public class LinkedComposite extends AbstractComposite {

    private LinkedList<Component> childrenList;

    public LinkedComposite(Component... components){
        childrenList = new LinkedList<>();
        for (Component c : components) { //register each component with parent
            add(c);
        }
    }

    @Override
    public void add(Component component) {
        childrenList.append(new Node<Component>(component));
        component.setParent(this);
    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public AbstractComposite getChild(int num) {
        return null;
    }

    @Override
    public String toString() {

        // FIXME: WHY DOES FOR LOOP NOT WORK WITH ITERATOR?
        String temp = "";
        Iterator iter = childrenList.createIterator();
        temp += iter.currentItem().returnData().toString();
        temp+="\n";
        do {
            iter.traverse();
            temp += iter.currentItem().returnData().toString();
            temp+="\n";
        } while ( !iter.isDone() );
        temp = temp.substring(0, temp.length()-1);
        return super.toString() + "LinkedComposite containing\n" + temp;
    }
}
