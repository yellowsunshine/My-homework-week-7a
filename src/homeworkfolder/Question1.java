package homeworkfolder;

import java.util.Scanner;

/**1. Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        scanner.close();

        String evenOrOdd = (number%2 ==0)? "Even" : "Odd"; //ternary operator is used
        System.out.println(number + " is " + evenOrOdd);//final output
    }
}
