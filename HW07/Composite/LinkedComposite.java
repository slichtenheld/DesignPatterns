package HW07.Composite;

import HW07.LinkedList.Iter;
import HW07.LinkedList.LinkedList;
import HW07.LinkedList.LinkedListIterator;
import HW07.LinkedList.Node;

/**
 * Created by sam on 10/9/16.
 */
public class LinkedComposite extends Composite {

    private LinkedList<Component> childrenList;

    public LinkedComposite(Component... components){
        super.setInstanceID();
        childrenList = new LinkedList<>();
        //register each component with parent
        for (Component c : components) add(c);

    }

    @Override
    protected void doAdd( Component part ) {
        childrenList.append(part);
    }

    @Override
    protected void doRemove( Component part ) {
        childrenList.remove(part);
    }

    @Override
    public Iter makeIterator() {
        return new LinkedListIterator<Component> (childrenList);
    }

    @Override
    public Component getChild(int num) {
        Iter<Component> iter = makeIterator();
        for (int i = 0; i <= num; i++) iter.next();
        return iter.currentItem();
    }
}
