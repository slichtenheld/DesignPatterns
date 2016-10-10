package HW07.Composite;

/**
 * Created by sam on 10/9/16.
 */
public abstract class Component {

    private Component parent = null;
    private int depth = 0;

    public String toString(){
        return indent();
    }

    protected Component getParent() {
        return parent;
    }

    protected void setParent(Component component) {
        this.parent = component;
        //setDepth();
    }

    private int getDepth() {
        return depth;
    } // FIXME: IMPLEMENT CACHING

    private void setDepth(){
        depth();
    } // FIXME: IMPLEMENT CACHING

    private int depth() {
        if (getParent()==null) return 0;
        else return getParent().depth()+1;
    }

    private String indent(){
        String indent = "";
        for(int i = 0; i < depth(); i++){
            indent+="   ";
        }
        return indent;
    }

}
