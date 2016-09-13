package TemplateMethod;

/**
 * Created by Sam on 9/13/2016.
 */
public class Currency extends Magnitude {

    private double currencyAmt;

    public Currency(double currencyAmt){
        this.currencyAmt = currencyAmt;
    }

    // lessThan Method violates some OOP principles
    // since a different subtype of Magnitude could be
    // passed to here
    @Override
    public boolean lessThan(Magnitude m) {
        if (this.currencyAmt < ((Currency) m).getCurrencyAmt()) return true;
        return false;
    }

    public double getCurrencyAmt() {
        return currencyAmt;
    }

}
