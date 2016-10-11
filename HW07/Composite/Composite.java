package HW07.Composite;

/**
 * Created by sam on 10/9/16.
 */

//must maintain invariant that
    // "If I think you are my child, you think I am your parent."
    // using the Template Method to accomplish this

public abstract class Composite extends Component{

    final public Composite add(Composite part ) {
        try {
            // let composites define how children are added
            doAdd( part );
            // set this component as the parent of the added part
            part.setParent(this);
        } catch (RuntimeException e){
            throw e;
        }
        return this; // returns itself????
    }

    final public Composite remove(Composite part ) {
        try {
            // let composites define how children are removed
            doRemove( part );
            // set the components parent to null (part.parent=null)
            part.setParent(null);
        } catch ( RuntimeException e ) {
            throw e;
        }
        return this;
    }

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

    //=================================================
    // Methods subclasses need to override
    //=================================================


    protected void doAdd( Composite part ) {
        throw new RuntimeException( "add() not supported" );
    }

    protected void doRemove( Composite part ) {
        throw new RuntimeException( "add() not supported" );
    }
}
