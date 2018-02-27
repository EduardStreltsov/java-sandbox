package com.codewars;

/*I have a cat and a dog which I got as kitten / puppy.
        I forget when that was, but I do know their current ages as catYears and dogYears.
        Find how long I have owned each of my pets and return as a list [ownedCat, ownedDog]
        NOTES:
        Results are truncated whole numbers of "human" years
        Cat Years
        15 cat years for first year
        +9 cat years for second year
        +4 cat years for each year after that
        Dog Years
        15 dog years for first year
        +9 dog years for second year
        +5 dog years for each year after that*/

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _7kyu_CatYearsDogYears2 {

    //    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
    public static int[] ownedCatAndDog(int catYears, int dogYears) {

        int ownedCat = catYears < 15 ? 0 : catYears < 24 ? 1 : 2 + (catYears - 24) / 4;
        int ownedDog = catYears < 15 ? 0 : catYears < 24 ? 1 : 2 + (catYears - 24) / 5;

        if (catYears < 15){
            catYears = 0;
        }
        if (catYears >= 15){
            ownedCat++;
            catYears -= 15;
            if (catYears >= 9) {
                ownedCat++;
                catYears -= 9;
                ownedCat += catYears / 4;
            }
        }

        if (dogYears < 15){
            dogYears = 0;
        }
        if (dogYears >= 15){
            ownedDog++;
            dogYears -= 15;
            if (dogYears >= 9) {
                ownedDog++;
                dogYears -= 9;
                ownedDog += dogYears / 5;
            }
        }

        return new int[]{ownedCat, ownedDog};
    }

    public static void main(String[] args) {
        int cat = 75;
        int dog = 30;
        System.out.println(Arrays.toString(ownedCatAndDog(cat, dog)));
        System.out.println(cat + " " + dog);
    }

}
