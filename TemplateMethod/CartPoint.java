package TemplateMethod;

/**
 * Created by Sam on 9/13/2016.
 */
public class CartPoint extends Magnitude {

    private double x,y;

    public CartPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean lessThan(Magnitude m) {
        if ((Math.sqrt(Math.pow(this.x,2f)+ Math.pow(this.y,2f))) < (Math.sqrt(Math.pow(((CartPoint)m).getX(),2f)+ Math.pow(((CartPoint)m).getY(),2f)))){
            return true;
        }
        return false;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
