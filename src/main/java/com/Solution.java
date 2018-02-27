package main.java.com;

public class Solution {

    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        public GenerateThread(){
            super(Integer.toString(++countCreatedThreads));
            start();
        }

        @Override
        public String toString() {
            return getName() + " created -- " +  Thread.currentThread().getName() + " created";
        }

        @Override
        public void run() {
            if (countCreatedThreads < count) {
                System.out.println(new GenerateThread());
            }
        }
    }

}
