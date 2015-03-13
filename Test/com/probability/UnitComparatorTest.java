package com.probability;

import com.porbability.UnitComparator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by suparnad on 3/13/2015.
 */
public class UnitComparatorTest {
    @Test
    public void test_getFactor_return_inchConversionfactor_for_unit_in_feet() {
        double d = UnitComparator.getFactor(UnitComparator.Units.Feet) ;
        assertEquals(d,12.0,0.0);
    }

    @Test
    public void test_getFactor_return_inchConversionfactor_for_unit_in_inchs() {
        double d = UnitComparator.getFactor(UnitComparator.Units.Inch) ;
        assertEquals(d,1.0,0.0);
    }

    @Test
    public void test_getFactor_return_inchConversionfactor_for_unit_in_cntimeter() {
        double d = UnitComparator.getFactor(UnitComparator.Units.Centimeter) ;
        assertEquals(d,0.4,0.0);
    }
}
