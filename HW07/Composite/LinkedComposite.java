package HW07.Composite;

import HW07.LinkedList.Iter;
import HW07.LinkedList.LinkedList;

/**
 * Created by sam on 10/9/16.
 */
public class LinkedComposite extends Composite {

    private LinkedList<Composite> childrenList;

    public LinkedComposite(Composite... components){
        childrenList = new LinkedList<>();
        for (Composite c : components) { //register each component with parent
            add(c);
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
