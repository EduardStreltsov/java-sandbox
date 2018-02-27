package com.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class _7kyu_CollatzConjectureLengthTest {

    @Test
    public void conjecture() {assertEquals(8, _7kyu_CollatzConjectureLength.conjecture(20));

        assertEquals(7, _7kyu_CollatzConjectureLength.conjecture(10));
        assertEquals(7, _7kyu_CollatzConjectureLength.conjecture(9));
    }
}