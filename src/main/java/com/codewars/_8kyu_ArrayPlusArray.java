package main.java.com.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _8kyu_ArrayPlusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sum();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};

        System.out.println(arrayPlusArray(a, b));

    }

}
