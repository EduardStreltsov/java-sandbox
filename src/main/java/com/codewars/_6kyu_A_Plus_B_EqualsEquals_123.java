package com.codewars;

//Given number A you must return number B so that
//
//        (int) (A + B) == 123
//        Note
//        B can't be negative
//
//        :-)

public class _6kyu_A_Plus_B_EqualsEquals_123 {
    
    public static long int123(final int a) {
        
        long b = (long)(123 + (-a));
        
        if (b < 0){
//            b = (long) ((Integer.MAX_VALUE + 1) * 2 + a);
            b = (long) ((Integer.MAX_VALUE + 1L) * 2L + (long)b);
        }
//        while ((int)(a + b) != 123) {
//            b++;
//        }
        return b;
    }
    
}
