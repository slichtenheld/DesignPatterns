package HW07.Composite;

import HW07.LinkedList.Iter;

/**
 * Created by sam on 10/9/16.
 */
public class InstanceComposite extends Composite {

    private Composite child;

    public InstanceComposite(Composite component) {
        add(component);
    }

    @Override
    protected void doAdd( Composite part ) {
    }

    @Override
    protected void doRemove( Composite part ) {
    }

    @Override
    public Iter makeIterator() {
        return null;
    }

    @Override
    public Composite getChild(int num) {
        return child;
    }

}
