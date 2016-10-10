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

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public AbstractComposite getChild(int num) {
        return null;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < children.length; i++){
            temp+= children[i].toString();
            temp+="\n";
        }
        temp = temp.substring(0, temp.length()-1);
        return super.toString() + "ArrayComposite containing\n" + temp;
    }
}
