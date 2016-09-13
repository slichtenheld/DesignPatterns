package TemplateMethod;

/**
 * Created by Sam on 9/13/2016.
 */

// template method for comparing values
// this = a, m = b

public abstract class Magnitude {

    public abstract boolean lessThan(Magnitude m);

    public boolean lessThanEqualTo(Magnitude m){
        return lessThan(m)|equalTo(m);
    }

    // a=b if (!(a<b)&&!(b<a))
    public boolean equalTo(Magnitude m){
        if (!(this.lessThan(m))&&!(m.lessThan(this))) return true;
        return false;
    }

    public boolean greaterThanEqualTo(Magnitude m){
        return !lessThan(m);
    }

    public boolean greaterThan(Magnitude m){
        return !lessThanEqualTo(m);
    }

    // a!=b if (!(a<b)||!(b<a))
    public boolean notEqual(Magnitude m){
        if (!this.equalTo(m)) return true;
        return false;
    }

}
