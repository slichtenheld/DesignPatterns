package TemplateMethod;

/**
 * Created by Sam on 9/13/2016.
 */

// template method for comparing values
// this = a, m = b

public abstract class Magnitude {

    protected abstract boolean lessThan(Magnitude m);

    protected boolean lessThanEqualTo(Magnitude m){
        return lessThan(m)|equalTo(m);
    }

    // a=b if (!(a<b)&&!(b<a))
    protected boolean equalTo(Magnitude m){
        if (!(this.lessThan(m))&&!(m.lessThan(this))) return true;
        return false;
    }

    protected boolean greaterThanEqualTo(Magnitude m){
        return !lessThan(m);
    }

    protected boolean greaterThan(Magnitude m){
        return !lessThanEqualTo(m);
    }

    protected boolean notEqual(Magnitude m){
        if (!this.equalTo(m)) return true;
        return false;
    }
}
