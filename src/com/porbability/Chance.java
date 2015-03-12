package com.porbability;

import java.util.Objects;

/**
 * Created by gauravd on 3/11/2015.
 */
public class Chance {
    private double value;
    private  static  final double CERTINITY=100;
    private  static  final double UNCERTINITY=0;

    private Chance(double value) {
        this.value =value;

    }

    public static Chance createChance(double value) {
        if(value>=UNCERTINITY&&value<=CERTINITY){
            return  new Chance(value);
        }

        return null;
    }

    public Chance and(Chance other) {
        double result = (this.value *other.value)/CERTINITY;

        return new Chance(result) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;

        if (Double.compare(chance.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    public Chance negate() {
        return new Chance(CERTINITY-value);
    }

    public Chance or(Chance other) {
        return (negate().and(other.negate())).negate();
    }

    @Override
    public String toString() {
        return "Chance{" +
                "value=" + value +
                '}';
    }
}
