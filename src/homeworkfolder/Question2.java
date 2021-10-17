package homeworkfolder;

import java.util.Scanner;

/**Write a java program to input any year like (ex.2007) and find out if it is leap year or
 not?
 */
public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year:");
        int year = scanner.nextInt();
        scanner.close();

        String leapyear = (year%4==0 && year%100!=0)? "a Leap Year" : "Not a Leap Year";
        System.out.println("The year " + year + " is " + leapyear);


    }
}
