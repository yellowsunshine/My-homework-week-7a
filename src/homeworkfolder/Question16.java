package homeworkfolder;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Question16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        if (number > 0) {
            System.out.println(number + " is a Positive number");

        } else if (number < 0) {
            System.out.println(number + " is a Negative number");

        } else {
            System.out.println(number + " is Zero");

        }
    }

}
