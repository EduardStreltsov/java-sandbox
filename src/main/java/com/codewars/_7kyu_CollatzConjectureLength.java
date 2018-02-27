package com.codewars;

/*The Collatz Conjecture states that for any natural number n, if n is even, divide it by 2. If n is odd, multiply it by 3 and add 1. If you repeat the process continously for n, n will eventually reach 1.
        For example, if n = 20, the resulting sequence will be:
        [20, 10, 5, 16, 8, 4, 2, 1]
        Write a program that will output the length of the Collatz Conjecture for any given n. In the example above, the output would be 8.
        For more reading see: http://en.wikipedia.org/wiki/Collatz_conjecture*/

public class _7kyu_CollatzConjectureLength {

    public static long conjecture(long x) {

        if (x <= 1) {
            return 1;
        }

        long lenght = 1;

        while (x > 1){

            lenght++;
            if (x%2 == 0){
                x /= 2;
            }
            else {
                x = x * 3 + 1;
            }
        }

        return lenght;
    }

}
