package com.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class _7kyu_CatYearsDogYears2Test {

    @Test
    public void one() {
        assertArrayEquals(new int[]{1,1}, _7kyu_CatYearsDogYears2.ownedCatAndDog(15,15));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,2}, _7kyu_CatYearsDogYears2.ownedCatAndDog(24,24));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,10}, _7kyu_CatYearsDogYears2.ownedCatAndDog(56,64));
    }
}