package homeworkfolder;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Question10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the calculation symbol +, -, / or * : ");
        char z = scanner.next().charAt(0); //symbols data type char

        System.out.println("Input the first number: ");
        int x = scanner.nextInt();

        System.out.println("Input the second number: ");
        int y = scanner.nextInt();
        scanner.close();

        if (z == '+') {
            System.out.println(x + " + " + y + " = " + (x + y)); //addition
        } else if (z == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));//subtraction
        } else if (z == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));//multiplication
        } else {
            System.out.println(+x + " / " + y + " = " + (x / y));//division
        }


    }
}
