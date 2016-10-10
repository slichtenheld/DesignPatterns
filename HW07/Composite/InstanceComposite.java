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
        if (child == null){ // child must be removed first
            child = component;
            component.setParent(this);
        }
    }

    @Override
    public void remove(Component component) {
        if (child == component) {
            child.setParent(null);
            child = null;
        }
    }

    @Override
    public Component getChild(int num) {
        return child;
    }

    @Override
    public String toString() {
        String temp = "";
        try {
            temp += "\n" + child.toString();
        } catch (NullPointerException e){
            System.err.print("NullPointerException: " + e.getMessage());
        }
        return super.toString() + "InstanceComposite containing" + temp;
    }
}
