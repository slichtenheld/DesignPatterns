package HW07.Composite;


import HW07.LinkedList.Iter;

/**
 * Created by sam on 10/9/16.
 */
public abstract class Component {

    private Composite parent = null;
    private int instanceID = 0;
    private int depth = 0;

    public abstract Iter makeIterator();
    public abstract Composite getChild(int num);

    final public String toString(){
        return (parent==null) ? instanceID + " is the root." :
                instanceID + " is the child of " + parent; // automagically calls toString method?
    }

    final protected Composite getParent() {
        return parent;
    }

    final protected void setParent(Composite component) {
        parent = component;
    }

    final protected void setInstanceID (int id){
        instanceID = id;
    }

}
