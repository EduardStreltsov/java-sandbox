package com.codewars;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class _6kyu_A_Plus_B_EqualsEquals_123Test {
    
    private void doIntTest(final int a) {
        final long b = _6kyu_A_Plus_B_EqualsEquals_123.int123(a);
        System.out.println("" + a + " + " + b + " = " + (int)(a+b));
        assertTrue("B must be >= 0", b >= 0);
        assertEquals("A + B must give 123", 123, (int)(a+b));
    }
    
    @Test
    public void testLess() {
        doIntTest(0);
    }
    
    @Test
    public void testSame() {
        doIntTest(123);
    }
    
    @Test
    public void testGreater() {
        doIntTest(500);
    }
}