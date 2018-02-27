package com.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class _7kyu_ATMTest {

    @Test
    public void testATM() {
        assertEquals(-1, new _7kyu_ATM().solve(8));
        assertEquals(-1, new _7kyu_ATM().solve(-8));
        assertEquals(-1, new _7kyu_ATM().solve(125));
        assertEquals(4, new _7kyu_ATM().solve(770));
        assertEquals(2, new _7kyu_ATM().solve(550));
        assertEquals(1, new _7kyu_ATM().solve(10));
        assertEquals(-1, new _7kyu_ATM().solve(238));
    }
}