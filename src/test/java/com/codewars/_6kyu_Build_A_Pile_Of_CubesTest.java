package com.codewars;

import static org.junit.Assert.*;

import org.junit.Test;


public class _6kyu_Build_A_Pile_Of_CubesTest {
    
    @Test
    public void test1() {
        assertEquals(2022, _6kyu_Build_A_Pile_Of_Cubes.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, _6kyu_Build_A_Pile_Of_Cubes.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, _6kyu_Build_A_Pile_Of_Cubes.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, _6kyu_Build_A_Pile_Of_Cubes.findNb(40539911473216L));
    }
    
}