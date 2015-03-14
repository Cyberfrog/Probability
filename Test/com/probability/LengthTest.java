package com.probability;

import com.porbability.Length;
import com.porbability.UnitComparator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by suparnad on 3/13/2015.
 */
public class LengthTest {
    @Test
    public void test_one_feet_is_equal_12_inches() {
        Length feet = new Length(1, UnitComparator.Units.Feet);
        Length inch = new Length(12, UnitComparator.Units.Inch);
        assertTrue(feet.equals(inch));
    }

    @Test
    public void test_one_feet_is_not_equal_10_inches() {
        Length feet = new Length(1, UnitComparator.Units.Feet);
        Length inch = new Length(10, UnitComparator.Units.Inch);
        assertFalse(feet.equals(inch));
    }

    @Test
    public void test_one_feet_is_equal_0p4_centimeters() {
        Length feet = new Length(1, UnitComparator.Units.Feet);
        Length centimeter = new Length(30.48, UnitComparator.Units.Centimeter);
        assertTrue(feet.equals(centimeter));
    }
}