package FactoryMethod.CritterExample;

/**
 * Created by Sam on 9/14/2016.
 */
public class main {

    public static void main ( String[] args){
        Critter critterA = new MeatCreator();
        Critter critterB = new LettuceCreator();

        critterA.eat();
        critterB.eat();
        critterA = critterB;
        critterA.eat();
    }
}
