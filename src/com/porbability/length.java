package com.porbability;

import java.util.Objects;

/**
 * Created by suparnad on 3/13/2015.
 */
public class Length {
    private double value;
    private  UnitComparator.Units unit;
    public Length(double value, UnitComparator.Units unit) {
        this.value =value;
        this.unit =unit;
    }
    public boolean equals(Object other){
        Length that = (Length)other;
        double thisLengthInches = value * UnitComparator.getFactor(unit);
        double otherLengthInches = that.value * UnitComparator.getFactor(that.unit);
        System.out.println(thisLengthInches +"--"+otherLengthInches);
        System.out.println(Math.abs(otherLengthInches-thisLengthInches));
        return Math.abs(otherLengthInches-thisLengthInches)<=0.1;
    }
}
