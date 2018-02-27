package com.codewars;

//Multiply two longs, but take care of overflow. If the result cannot be accurately stored in a long, throw an ArithmeticException.

import java.math.BigInteger;

public class _6kyu_Owerflowing_Wigh_Longing {
    
    public static long multiply(long a, long b) throws ArithmeticException {
//        if (BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).longValueExact() > Long.MAX_VALUE){
//            throw new ArithmeticException();
//        }
//        return (long) a * b;
//        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).longValueExact();
        return Math.multiplyExact(a, b);
    }
    
}
