package homeworkfolder;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        n = s.nextInt();
        s.close();

        if (n%2==0){
            System.out.println("The given number "+ n +" is even");
        } else {
            System.out.println("The given number "+ n +" is odd");
        }
    }
}
