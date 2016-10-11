package HW07.Composite;

import HW07.LinkedList.Iter;

/**
 * Created by sam on 10/9/16.
 */
public class ArrayComposite extends Composite {

    private Composite[] children;

    public ArrayComposite(Composite... components){
        this.children = components;
        for (Composite c : children) { //register each component with parent
            c.setParent(this);
        }
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
        return null;
    }


}
