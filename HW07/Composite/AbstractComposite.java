package HW07.Composite;


/**
 * Created by sam on 10/9/16.
 */
public abstract class AbstractComposite extends Component{

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int num);

}
