package HW07.Composite;

import HW07.LinkedList.Iter;

/**
 * Created by sam on 10/9/16.
 */
public class Leaf extends Component {

    public Leaf(int id){
        super.setInstanceID(id);
    }

    @Override
    public Iter makeIterator() {
        // return LeafIterator
        return null;
    }

    @Override
    public Composite getChild(int num) {
        return null;
    }

}
