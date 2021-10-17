package homeworkfolder;

/**
 * Write a Java program to calculate the average value of array
 */

public class Question19 {

    public static void main(String[] args) {

        int[] num_array = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897,
                1455, 787};

        int sum = 0;
        for (int i = 0; i < num_array.length; i++) {
            sum = sum + num_array[i];
        }

        double average = sum/ num_array.length;
        System.out.println("Values of the elements of the array are: " + "1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787");
        System.out.println("Average of all the values of the array are: " + average);


    }
}
