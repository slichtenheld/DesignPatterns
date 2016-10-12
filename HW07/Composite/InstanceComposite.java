package HW07.Composite;

import HW07.LinkedList.InstanceIterator;
import HW07.LinkedList.Iter;

/**
 * Created by sam on 10/9/16.
 */
public class InstanceComposite extends Composite {

    private Component child = null;

    public InstanceComposite(Component component) {
        super.setInstanceID();
        add(component);
    }

    @Override
    protected void doAdd( Component part ) {
        if ( child == null ) child = part;
    }

    @Override
    protected void doRemove( Component part ) {
        if (child == part) child = null;
    }

    @Override
    public Iter makeIterator() {
        return new InstanceIterator<Component>(child);
    }

    @Override
    public Component getChild(int num) {
        return child;
    }

}
