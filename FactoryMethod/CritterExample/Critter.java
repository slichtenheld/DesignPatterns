package FactoryMethod.CritterExample;

/**
 * Created by Sam on 9/14/2016.
 */
public abstract class Critter {

    protected abstract Chow makeChow();

    protected void eat(){
        Chow food = makeChow();
        omNomNom(food);
    }
    private void omNomNom(Chow chow){
        System.out.println(chow.returnName() + " is delicious!");
    }
}
