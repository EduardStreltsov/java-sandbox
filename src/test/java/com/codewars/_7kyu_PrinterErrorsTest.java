package com.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class _7kyu_PrinterErrorsTest {

    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", _7kyu_PrinterErrors.printerError(s));
    }
}