package TemplateMethod;

/**
 * Created by Sam on 9/13/2016.
 */


public class main {

    public static void main(String[] args) {
        System.out.println("Running CartPoint Test...");
        if (cpTest()) {
            System.out.println("passed.");
        }
        else System.out.println("failed.");

        System.out.println("Running Currency Test...");
        if (cTest()) {
            System.out.println("passed.");
        }
        else System.out.println("failed.");

        simpleTest();
    }

    public static boolean cpTest(){
        CartPoint cp0 = new CartPoint(1,2);
        CartPoint cp1 = new CartPoint(2,1);
        CartPoint cp2 = new CartPoint(5,4);
        CartPoint cp3 = new CartPoint(1,1);

        return(
                (cp0.lessThan(cp2)) && //true
                !(cp2.lessThan(cp3)) && //false

                (cp3.lessThanEqualTo(cp0))&& //true
                !(cp2.lessThanEqualTo(cp1))&& //false

                (cp1.equalTo(cp0))&& //true
                !(cp0.equalTo(cp3))&& //false

                (cp2.greaterThanEqualTo(cp3))&& //true
                (cp0.greaterThanEqualTo(cp1))&& //true

                !(cp1.greaterThan(cp0))&& //false
                (cp2.greaterThan(cp1))&& //true

                !(cp1.notEqual(cp1))&& //false
                (cp2.notEqual(cp0)) //true
        );
    }

    public static boolean cTest(){

        Currency c0 = new Currency(5.75);
        Currency c1 = new Currency(0.11);
        Currency c2 = new Currency(100.01);
        Currency c3 = new Currency(5.75);

        return (
                (c0.lessThan(c2))&& //true
                (!c2.lessThan(c3))&& //false

                (c3.lessThanEqualTo(c0))&& //true
                (!c2.lessThanEqualTo(c1))&& //false

                (!c1.equalTo(c0))&& //false
                (c0.equalTo(c3))&& //true

                (c2.greaterThanEqualTo(c3))&& //true
                (c0.greaterThanEqualTo(c1))&& //true

                (!c1.greaterThan(c0))&& //false
                (c2.greaterThan(c1))&& //true

                (c1.notEqual(c0))&& //true
                (c2.notEqual(c3)) //true
        );
    }

    public static void simpleTest(){
        CartPoint cp0 = new CartPoint(1,2);
        CartPoint cp1 = new CartPoint(2,1);
        CartPoint cp2 = new CartPoint(5,4);
        CartPoint cp3 = new CartPoint(1,1);

        print(cp0.lessThan(cp2)); //true
        print(cp2.lessThan(cp3)); //false

        print(cp3.lessThanEqualTo(cp0)); //true
        print(cp2.lessThanEqualTo(cp1)); //false

        print(cp1.equalTo(cp0)); //true
        print(cp0.equalTo(cp3)); //false

        print(cp2.greaterThanEqualTo(cp3)); //true
        print(cp0.greaterThanEqualTo(cp1)); //true

        print(cp1.greaterThan(cp0)); //false
        print(cp2.greaterThan(cp1)); //true

        print(cp1.notEqual(cp1)); //false
        print(cp2.notEqual(cp0)); //true

        System.out.println("- - - - ");
        print(cp1.lessThan(cp1)); //false
        print(cp1.lessThan(cp0)); //false
        print(cp2.lessThan(cp1)); //false
        print(cp1.lessThan(cp2)); //true
        print(cp1.notEqual(cp0)); //false equal to ---
        print(cp1.notEqual(cp1)); //f
        print(cp1.notEqual(cp2)); //t
        print(cp1.equalTo(cp0)); //T
        print(cp1.equalTo(cp1)); //F
        print(cp1.equalTo(cp2)); //F
        System.out.println("- - - - ");

        System.out.println("_____");

        Currency c0 = new Currency(5.75);
        Currency c1 = new Currency(0.11);
        Currency c2 = new Currency(100.01);
        Currency c3 = new Currency(5.75);

        print(c0.lessThan(c2)); //true
        print(c2.lessThan(c3)); //false

        print(c3.lessThanEqualTo(c0)); //true
        print(c2.lessThanEqualTo(c1)); //false

        print(c1.equalTo(c0)); //false
        print(c0.equalTo(c3)); //true

        print(c2.greaterThanEqualTo(c3)); //true
        print(c0.greaterThanEqualTo(c1)); //true

        print(c1.greaterThan(c0)); //false
        print(c2.greaterThan(c1)); //true

        print(c1.notEqual(c0)); //true
        print(c2.notEqual(c3)); //true

        System.out.println("+ + + + ");
        print(c1.lessThan(c1)); //false
        print(c1.lessThan(c0)); //true
        print(c2.lessThan(c1)); //false
        print(c1.lessThan(c2)); //true
        print(c1.notEqual(c0)); //true
        print(c1.notEqual(c1)); //false
        print(c0.notEqual(c3)); //false
        System.out.println("+ + + + ");
    }

    public static void print(boolean b){
        if (b) System.out.println("TRUE");
        else System.out.println("FALSE");
    }
}
