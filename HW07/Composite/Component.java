package HW07.Composite;


import HW07.LinkedList.Iter;

/**
 * Created by sam on 10/9/16.
 */
public abstract class Component {

    private static int id = 0;
    private Component parent = null;
    private int instanceID = 0;

    public abstract Iter makeIterator();
    public abstract Component getChild(int num);

    final public String toString(){
        return (parent==null) ? instanceID + " is the root." :
                instanceID + " is the child of " + parent; // automagically calls toString method?
    }

    final protected Component getParent() {
        return parent;
    }

    final protected void setParent(Component component) {
        parent = component;
    }

    final protected void setInstanceID (){
        instanceID = id;
        id++;
    }

}
