package com.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class _6kyu_Owerflowing_Wigh_LongingTest {
    
    @Test
    public void test00() {
        assertEquals(0, _6kyu_Owerflowing_Wigh_Longing.multiply(0, 0));
    }
    
    @Test
    public void test2345() {
        assertEquals(1035, _6kyu_Owerflowing_Wigh_Longing.multiply(23, 45));
    }
    
    @Test
    public void test3456() {
        assertEquals(-1904, _6kyu_Owerflowing_Wigh_Longing.multiply(-34, 56));
    }
    
    @Test
    public void testMin() {
        assertEquals(Long.MIN_VALUE, _6kyu_Owerflowing_Wigh_Longing.multiply(-2147483648L, 4294967296L));
    }
    
    @Test
    public void testMax() {
        assertEquals(Long.MAX_VALUE, _6kyu_Owerflowing_Wigh_Longing.multiply(2323823089L, 3969050863L));
    }
    
    @Test(expected=ArithmeticException.class)
    public void testOverflowMax() {
        _6kyu_Owerflowing_Wigh_Longing.multiply(Long.MAX_VALUE, Long.MAX_VALUE);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testOverflowMin() {
        _6kyu_Owerflowing_Wigh_Longing.multiply(Long.MIN_VALUE, Long.MIN_VALUE);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testOverflowMaxMin() {
        _6kyu_Owerflowing_Wigh_Longing.multiply(Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testOverflow1() {
        _6kyu_Owerflowing_Wigh_Longing.multiply(119537721L, 77158673929L); // -> Long.MAX_VALUE + 2
    }
    
    @Test(expected=ArithmeticException.class)
    public void testOverflow2() {
        _6kyu_Owerflowing_Wigh_Longing.multiply(-2761311370L, 3340214413L); // -> Long.MIN_VALUE - 2
    }
    
}