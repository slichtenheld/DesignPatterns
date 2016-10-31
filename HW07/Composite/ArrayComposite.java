package HW07.Composite;

import HW07.LinkedList.ArrayIterator;
import HW07.LinkedList.Iter;

/**
 * Created by sam on 10/9/16.
 */
public class ArrayComposite extends Composite {

    private Component[] children;

    public ArrayComposite(Component... components){
        super.setInstanceID();
        this.children = components;
        //register each component with parent
        for (Component c : children) add(c);
    }

    @Override
    protected void doAdd( Component part ) {
        for ( int i = 0; i < children.length; i++ ) {
            if ( children[i] == null ) {
                children[i] = part;
                break;
            }
        }
    }

    @Override
    protected void doRemove( Component part ) {
        for ( int i = 0; i < children.length; i++ ) {
            if ( children[i] == part ) {
                children[i] = null;
                break;
            }
        }
    }

    @Override
    public Iter makeIterator() {
        return new ArrayIterator(children);
    }

    @Override
    public Component getChild(int num) {
        try {
            return children[num];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

}
