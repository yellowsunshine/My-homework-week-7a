package homeworkfolder;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Question11 {

    public static void main(String[] args) {

        System.out.println("Numbers divisible by 3 are: ");
        System.out.println("");

        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i+",");
            }
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Numbers divisible by 5 are: ");
        System.out.println("");
        int x;
        for (x = 1; x <= 100; x++) {
            if (x % 5 == 0) {
                System.out.print(x+",");


            }
        }
    }
}

