package com._20180114interview;

import java.math.BigInteger;

public class Factorial {

    public static String calcFactorialUsingBigInteger(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result.toString();
    }

    public static String calcFactorialUsingMyInteger(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        MyBigInteger result = MyBigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            result = result.multiply(MyBigInteger.valueOf(i));
        }
        return result.toString();
    }

    private Factorial() {
        // Utility class
    }

}
