package com._20180114interview;

import org.junit.Test;

import java.util.ArrayList;

import static com._20180114interview.MyBigInteger.addTwoArraysOfDigits;
import static org.junit.Assert.*;

public class MyIntegerTest {

//    {6,7,4,8} + {3,8,1} = {7,1,2,9}
//    {1,0} + {1,5,6} = {1,6,6}
//    {1,0,0} + {0} = {1,0,0}
//    {1,0,0} + {1} = {1,0,1}

    private static int[] longToArrayOfDigits(long number){

        long temp = number;
        ArrayList<Long> array = new ArrayList<>();
        do {
            array.add(temp % 10);
            temp /= 10;
        } while (temp > 0);
        int[] arr = array.stream().mapToInt(i -> Math.toIntExact(i)).toArray();

        return arr;
    }

    @Test
    public void additionRandom(){
        assertArrayEquals(new int[]{7,1,2,9}, addTwoArraysOfDigits(new int[]{3,8,1}, new int[]{6,7,4,8}));
    }

    @Test
    public void additionCommutativity(){
        assertArrayEquals(addTwoArraysOfDigits(new int[]{3,8,1}, new int[]{6,7,4,8}), addTwoArraysOfDigits(new int[]{3,8,1}, new int[]{6,7,4,8}));
    }

    @Test
    public void additionAssociativity(){
        assertArrayEquals(new int[]{3,8,1}, addTwoArraysOfDigits(new int[]{3,8,1}, new int[]{0}));
    }

    @Test
    public void additionOverLongMaxValue(){
        assertArrayEquals(new int[]{1, 4, 1, 7, 1, 5, 4, 9, 1, 7, 2, 6, 0, 5, 4, 6, 6, 4, 5, 8}, addTwoArraysOfDigits(longToArrayOfDigits(Long.MAX_VALUE), longToArrayOfDigits(Long.MAX_VALUE)));
    }





    @Test
    public void random() {
        assertArrayEquals(new int[]{1,5,3,7,2}, MyBigInteger.multiplyTwoArraysOfDigits(new int[]{4,2,7}, new int[]{3,6}));
    }

    @Test
    public void propertyOfZero() {
        assertArrayEquals(new int[]{0}, MyBigInteger.multiplyTwoArraysOfDigits(new int[]{4,2,7}, new int[]{0}));
    }

    @Test
    public void identityProperty() {
        assertArrayEquals(new int[]{4,2,7}, MyBigInteger.multiplyTwoArraysOfDigits(new int[]{4,2,7}, new int[]{1}));
    }

    @Test
    public void commutativeProperty() {
        assertArrayEquals(MyBigInteger.multiplyTwoArraysOfDigits(new int[]{3,6}, new int[]{4,2,7}), MyBigInteger.multiplyTwoArraysOfDigits(new int[]{4,2,7}, new int[]{3,6}));
    }


}