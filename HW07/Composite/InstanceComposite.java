package HW07.Composite;

/**
 * Created by sam on 10/9/16.
 */
public class InstanceComposite extends AbstractComposite {

    private Component child;

    public InstanceComposite(Component component) {
        add(component);
    }

    @Override
    public void add(Component component) { //
        child = component;
        component.setParent(this);
    }

    @Override
    public void remove(Component component) {
        if (child == component) child = null;
    }

    @Override
    public Component getChild(int num) {
        return child;
    }

    @Override
    public String toString() {
        return super.toString() + "InstanceComposite containing\n" + child.toString();
    }
}
