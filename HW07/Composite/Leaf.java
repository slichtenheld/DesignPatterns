package HW07.Composite;

/**
 * Created by sam on 10/9/16.
 */
public class Leaf extends Component {

    String data;

    public Leaf(String string){
        this.data = string;
    }

    @Override
    public String toString() {
        return super.toString() + "Leaf " + data;
    }
}
