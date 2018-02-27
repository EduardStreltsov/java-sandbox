package com.codewars;

/*There is enough money available on ATM in nominal value 10, 20, 50, 100, 200 and 500 dollars.
You are given money in nominal value of n with 1<=n<=1500.
Try to find minimal number of notes that must be used to repay in dollars, or output -1 if it is impossible.*/

public class _7kyu_ATM {

    public int solve(int n) {

        if (n < 10 || n % 10 != 0){
            return -1;
        }

        int[] nominals = {500, 200, 100, 50, 20, 10};

        int notes = 0;
        int rem = n;

        for (int i = 0; i < nominals.length; i++) {

            if (rem == 0) {
                break;
            }

            notes += rem / nominals[i];
            rem = rem % nominals[i];

        }

        return notes;

    }

}
