package FactoryMethod.CritterExample;

/**
 * Created by Sam on 9/14/2016.
 */
public class Meat implements Chow {
    @Override
    public String returnName() {
        return "Meat";
    }
}
