package com._20180114interview;
        
        import java.util.ArrayList;
        import java.util.Arrays;

public class MyBigInteger {
    
    // todo: Define internal state
    private long value;
    private MyBigInteger mag;
    
    private MyBigInteger(long value) {
        
        //        int temp = test;
        //        ArrayList<Integer> array = new ArrayList<Integer>();
        //        do{
        //            array.add(temp % 10);
        //            temp /= 10;
        //        } while  (temp > 0);
        
        this.value = value;
    }
    
    public static MyBigInteger valueOf(long value) {
        // todo: Implement this method
        return new MyBigInteger(value);
    }
    
    public MyBigInteger multiply(MyBigInteger value) {
        // todo: Implement this method
        return valueOf(this.value * value.value);
    }
    
    public MyBigInteger substruct(MyBigInteger value) {
        
        return null;
    }
    
    @Override
    public String toString() {
        // todo: Implement this method
        return Long.toString(value);
    }
    
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
    
    private static int[] trimLeadingZeroesOfArray(int[] arr) {
        
        int i0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) break;
            i0++;
        }
        if (i0 > 0) {
            return Arrays.copyOfRange(arr, i0 == arr.length ? i0-1 : i0, arr.length);
        }
        return arr;
    }
    
    public static int[] addTwoArraysOfDigits(int[] a, int[] b) {
        
        int[] result = new int[Math.max(a.length, b.length) + 1];
        
        for (int i = 1; i <= result.length; i++) {
            
            int valA = i > a.length ? 0 : a[a.length - i];
            int valB = i > b.length ? 0 : b[b.length - i];
            
            int rem = (valA + valB + result[result.length - i]) % 10;
            int dec = (valA + valB + result[result.length - i]) / 10;
            result[result.length - i] = rem;
            if (result.length - i > 0) {
                result[result.length - i - 1] = result[result.length - i - 1] + dec;
            }
        }
        
        return trimLeadingZeroesOfArray(result);
    }
    
    public static int[] multiplyTwoArraysOfDigitsOld(int[] a, int[] b) {
        
        int length = a.length + b.length;
        int[] result = new int[length];
        
        for (int i = 1; i <= length; i++) {
            
            int[] cash = new int[length];
            
            for (int j = 1; j <= length; j++) {
                
                int ma = j > a.length ? 0 : a[a.length - j];
                int mb = i > b.length ? 0 : b[b.length - i];
                
                if (length - j - i + 1 >= 0) {
                    result[length - j - i + 1] += ma * mb % 10 + cash[length - j];
                }
                
                if (length > j) {
                    cash[length - j - 1] += ma * mb / 10;
                }
            }
            
        }
        
        int cash = 0;
        for (int i = 1; i <= length; i++) {
            
            int curr = result[length - i] + cash;
            cash = curr / 10;
            curr %= 10;
            result[length - i] = curr;
            
        }
        
        return trimLeadingZeroesOfArray(result);
    }
    
    public static int[] multiplyTwoArraysOfDigits(int[] a, int[] b) {
        
        int length = a.length + b.length;
        int[] result = new int[length];
        int cash;
        
        for (int i = 1; i <= length; i++) {
            
            cash = 0;
            
            for (int j = 1; j <= length; j++) {
                
                int ma = j > a.length ? 0 : a[a.length - j];
                int mb = i > b.length ? 0 : b[b.length - i];
                
                if (length - j - i + 1 >= 0) {
                    result[length - j - i + 1] += ma * mb % 10 + cash;
                }
                
                cash = ma * mb / 10;
            }
            
        }
        
        cash = 0;
        for (int i = 1; i <= result.length; i++) {
            
            int curr = result[length - i] + cash;
            cash = curr / 10;
            curr %= 10;
            result[length - i] = curr;
            
        }
        
        return trimLeadingZeroesOfArray(result);
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiplyTwoArraysOfDigitsOld(new int[]{4, 2, 7}, new int[]{3, 6})));
        System.out.println(Arrays.toString(multiplyTwoArraysOfDigits(new int[]{4, 2, 7}, new int[]{3, 6})));
        //        System.out.println(Arrays.toString(longToArrayOfDigits(Long.MAX_VALUE)));
        //        System.out.println(Arrays.toString(multiplyTwoArraysOfDigitsOld(longToArrayOfDigits(Long.MAX_VALUE), longToArrayOfDigits(Long.MAX_VALUE))));
        //        System.out.println(Arrays.toString(multiplyTwoArraysOfDigits(longToArrayOfDigits(Long.MAX_VALUE), longToArrayOfDigits(Long.MAX_VALUE))));
    }
    
    
}
