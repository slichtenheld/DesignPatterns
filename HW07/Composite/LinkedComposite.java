package HW07.Composite;

import HW07.LinkedList.Iterator;
import HW07.LinkedList.LinkedList;
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
        if (childrenList.remove(component)) { // if removal successful, dereference component's parent
            component.setParent(null);
        }
    }

    @Override
    public AbstractComposite getChild(int num) {
        return null;
    }

    @Override
    public String toString() {

        String temp = "";
        Iterator iter = childrenList.createIterator();
        if (childrenList.getCount()==0) return super.toString() + "LinkedComposite containing";
        temp+="\n";
        temp += iter.currentItem().returnData().toString();
        while ( !iter.isDone() ){
            iter.traverse();
            temp+="\n";
            temp += iter.currentItem().returnData().toString();
        }
        return super.toString() + "LinkedComposite containing" + temp;
    }
}
