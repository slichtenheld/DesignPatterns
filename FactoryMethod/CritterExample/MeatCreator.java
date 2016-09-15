package FactoryMethod.CritterExample;

/**
 * Created by Sam on 9/14/2016.
 */
public class MeatCreator extends Critter{

    @Override
    public Chow makeChow() {
        return new Meat();
    }
}
