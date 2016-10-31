package HW07.Composite;

import HW07.LinkedList.InstanceIterator;
import HW07.LinkedList.Iter;
import HW07.LinkedList.LeafIterator;

/**
 * Created by sam on 10/9/16.
 */
public class Leaf extends Component {

    public Leaf(){
        super.setInstanceID();
    }

    @Override
    public Iter makeIterator() {
        return new LeafIterator();
    }

    @Override
    public Composite getChild(int num) {
        return null;
    }

}
