package homeworkfolder;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mathsMarks, scienceMarks, englishMarks, total;
        double percentage;
        String result, grade = null;

        //Scanner Inputs
        System.out.println("Please enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Please enter student's roll number:");
        int rollNum = scanner.nextInt();


        System.out.println("Enter Maths Marks:");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            scanner.next();
        }
        mathsMarks = scanner.nextInt();
        while (mathsMarks > 100 || mathsMarks < 0) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            mathsMarks = scanner.nextInt();
        }

        System.out.println("Enter Science Marks:");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            scanner.next();
        }
        scienceMarks = scanner.nextInt();
        while (scienceMarks > 100 || scienceMarks < 0) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            scienceMarks = scanner.nextInt();
        }

        System.out.println("Enter English Marks:");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            scanner.next();
        }
        englishMarks = scanner.nextInt();
        while (englishMarks > 100 || englishMarks < 0) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            englishMarks = scanner.nextInt();
            scanner.close();
        }

        double x = sum(mathsMarks, scienceMarks, englishMarks);
        System.out.println(x);
        percentage = x / 300 * 100;
        System.out.println(percentage);
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println(result);

        if (percentage >= 80) {
            grade = "A+";
            System.out.println(grade);
        } else if (percentage >= 60 && percentage <= 79) {
            grade = "A";
            System.out.println(grade);
        } else if (percentage >= 50 && percentage <= 59) {
            grade = "B";
            System.out.println(grade);
        } else if (percentage >= 35 && percentage <= 49) {
            grade = "C";
            System.out.println(grade);
        }
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name+"                  |");
        System.out.println("| Roll No:" + rollNum +"                 |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:"    + mathsMarks+"                   |");
        System.out.println("| Science:" + scienceMarks+"                |");
        System.out.println("| English:" + englishMarks+"                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + x +"               |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:"+ percentage+"           |");
        System.out.println("| Result:"    + result+"               |");
        System.out.println("| Grade:"    + grade +"                  |");
        System.out.println("|___________________________|");

    }
    //calculating the sun
    public static int sum(int a, int b, int c) {
        int x = a + b + c;
        return x;
    }


}
