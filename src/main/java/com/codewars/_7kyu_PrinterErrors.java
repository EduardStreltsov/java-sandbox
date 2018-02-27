package com.codewars;

public class _7kyu_PrinterErrors {
    public static String printerError(String s) {

        int errors = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 97 || s.charAt(i) > 109) {
                errors++;
            }
        }

        return errors +"/" + s.length();
    }
}
