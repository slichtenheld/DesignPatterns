package HW07.Composite;

/**
 * Created by sam on 10/9/16.
 */
public class ArrayComposite extends AbstractComposite {

    private Component[] children;

    public ArrayComposite(Component... components){
        this.children = components;
        for (Component c : children) { //register each component with parent
            c.setParent(this);
        }
    }

    public void printParent(){
        if (super.getParent()==null) System.out.println("\nparent null");
        else System.out.println("\nnot null");
    }

    @Override
    public void add(Component component) {
        for (int i = 0; i < children.length; i ++) {
            if (children[i] == null) {
                children[i] = component;
                component.setParent(this);
                break;
            }
        }
    }

    @Override
    public void remove(Component component) {
        for (int i = 0; i < children.length; i++){
            if (children[i] == component) { // delete and remove parent
                children[i].setParent(null);
                children[i] = null;
                break;
            }
        }
    }

    @Override
    public AbstractComposite getChild(int num) {
        return null;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < children.length; i++){
            if (children[i] != null){
                temp+="\n";
                temp+= children[i].toString();
            }
        }
        //temp = temp.substring(0, temp.length()-1);
        return super.toString() + "ArrayComposite containing" + temp;
    }
}
