package homeworkfolder;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Question17 {

    public static void main(String[] args) {
        int [] num_array = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897,
                1455, 787};
        String []  str_array = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual Numerical Array was: " + Arrays.toString(num_array));
        Arrays.sort(num_array);
        System.out.println("Sorted Numerical Array is: " +Arrays.toString(num_array));

        System.out.println("");
        System.out.println("");


        System.out.println("Actual String Array was: " + Arrays.toString(str_array));
        Arrays.sort(str_array);
        System.out.println("Sorted Numerical Array is: " +Arrays.toString(str_array));
    }

}
