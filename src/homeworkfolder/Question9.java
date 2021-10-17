package homeworkfolder;

//Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry USING SWITCH STATEMENT

import java.util.ArrayList;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList();//creating a new array list
        Scanner input = new Scanner(System.in);


        System.out.println("Enter any alphabet from A to F and the city name from that letter will be displayed: ");
        String letter = input.next();
        input.close();

        /* using to upper case to allow change of case */
        switch (letter.toUpperCase()) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("Invalid Letter Provided");

        }


    }
}



