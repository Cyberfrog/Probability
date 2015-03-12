package com.probability;

import com.porbability.Chance;
import org.junit.Test;

import static com.porbability.Chance.createChance;
import static org.junit.Assert.*;

/**
 * Created by gauravd on 3/11/2015.
 */
public class ChanceTest {

    @Test
    public void test_create_probability_return_null_for_invalid_probability() {
        Chance c = createChance(108);
        assertNull(c);
    }

    @Test
    public void test_create_probability_return_chance_object_for_valid_value() {
        Chance c = createChance(90);
        assertNotNull(c);
    }
    @Test
    public void testEqualsReturnsTrueForEqualChance() {
        Chance c1 = createChance(50);
        Chance c2 =createChance(50);
        assertTrue(c1.equals(c2));
    }
    @Test
    public void testEqualsReturnsFalseForNotEqualChance() {
        Chance c1 = createChance(50);
        Chance c2 =createChance(25);
        assertFalse(c1.equals(c2));
    }
    @Test
    public void test_And_retuns_new_probability_with_product_of_two_probability() {
        Chance c1 = createChance(25);
        Chance c2 =createChance(50);
        Chance r = c1.and(c2);
        Chance expected  = createChance(12.5);
        assertEquals(expected,r);
    }

    @Test
    public void test_negate_returns_negative_probability() {
        Chance c = Chance.createChance(90);
        Chance r = c.negate();
        Chance expected =createChance(10);
        assertEquals(expected,r);
    }

    @Test
    public void test_Or_retuns_new_probability_with_or_of_two_probability() {
        Chance c1 = createChance(50);
        Chance c2 =createChance(50);
        Chance r = c1.or(c2);
        Chance expected  = createChance(75);
        assertEquals(expected,r);
    }
    @Test
    public void test_Or_retuns_new_probability_with_or_r_of_two_probability() {
        Chance c1 = createChance(25);
        Chance c2 =createChance(75);
        Chance r = c1.or(c2);
        Chance expected  = createChance(81.25);
        assertEquals(expected,r);
    }

    @Test
    public void test_Or_retuns_new_probability_with_or_or_of_two_probability() {
        Chance c1 = createChance(16.67);
        Chance c2 =createChance(33.33);
        Chance r = c1.or(c2);
        Chance expected  = createChance(44.443889);
        assertEquals(expected,r);
    }
}
