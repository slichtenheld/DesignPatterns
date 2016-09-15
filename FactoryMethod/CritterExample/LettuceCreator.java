package FactoryMethod.CritterExample;

/**
 * Created by Sam on 9/14/2016.
 */
public class LettuceCreator extends Critter {

    @Override
    public Chow makeChow() {
        return new Lettuce();
    }
}
