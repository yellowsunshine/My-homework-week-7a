package homeworkfolder;

/**
 * Write a Java program to test if an array contains a specific
 * value.
 */

public class Question20 {

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num_array = {1789, 2035, 1899, 2040, 1950, 2255, 7897,
                1455, 787};
        System.out.println(contains(num_array, 2035));
        System.out.println(contains(num_array, 7999));
    }
}
