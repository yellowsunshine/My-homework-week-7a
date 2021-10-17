package homeworkfolder;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Question12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is AN ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A DIGIT.");

        } else {
            System.out.println(ch + " is A SYMBOL.");
        }

    }
}
