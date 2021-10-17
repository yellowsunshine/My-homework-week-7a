package homeworkfolder;

//Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList();
        Scanner input = new Scanner(System.in);
        cityName.add("Aberdeen");
        cityName.add("Belfast");
        cityName.add("Cambridge");
        cityName.add("Derby");
        cityName.add("Edinburgh");
        cityName.add("Feltham");

        System.out.println("Search City Name by letter: ");
        String letter = input.next();

        if (letter.startsWith("A")) {
            System.out.println("Aberdeen");
        } else if (letter.startsWith("B")) {
            System.out.println("Belfast");
        } else if (letter.startsWith("C")) {
            System.out.println("Cambridge");
        } else if (letter.startsWith("D")) {
            System.out.println("Derby");
        } else if (letter.startsWith("E")) {
            System.out.println("Edinburgh");
        } else if (letter.startsWith("F")) {
            System.out.println("Feltham");
        } else {
            System.out.println("This is an invalid entry");
        }


    }

}
