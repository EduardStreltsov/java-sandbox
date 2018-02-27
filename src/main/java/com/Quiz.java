package main.java.com;

import java.util.Arrays;

class Test {

    private int x = 0;

    void test(){
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = new int[4];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 5;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }


}

class Sub1 extends Test{

    public int y = 0;

    @Override
    void test(){
        System.out.println(y);
    }

}