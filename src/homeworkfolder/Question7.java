package homeworkfolder;

/**
 * Write a java program input sales id, seller id, sellers name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount &gt;= 50,000 35%
 * Sales amount &gt;= 30,000 20%
 * &gt;= 20,000 10%
 * &gt;= 10,000 5%
 * &lt; 10,000 2%
 * <p>
 * /*ALL MULTIPLES OF 5 FROM 5 TO 500
 * for (int i = 5; i <= 500; i++) {
 * if (i % 5 == 0) {
 * System.out.println(i);}
 */

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Sellers Name: ");
        String name = scanner.nextLine();

        System.out.println("Input Sales ID:");
        int sale_id = scanner.nextInt();

        System.out.println("Input Sales Amount:");
        int sales_amount = scanner.nextInt();

        System.out.println("Input Basic Salary: ");
        int basic_salary = scanner.nextInt();
        scanner.close();

        int commission;
        //conditional statements to find out the commission value based on salary
        if (sales_amount >= 50000) {
            commission = (sales_amount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (sales_amount >= 30000 && sales_amount <= 49999) {
            commission = (sales_amount * 20) / 100;
            System.out.println("Sales Commission is " +commission);
        } else if (sales_amount >= 20000 && sales_amount <= 29999) {
            commission = (sales_amount * 10) / 100;
            System.out.println("Sales Commission is " +commission);
        } else if (sales_amount>=10000 && sales_amount<=19999) {
            commission = (sales_amount * 5) / 100;
            System.out.println("Sales Commission is " +commission);
        } else if (sales_amount<10000){
            commission = (sales_amount*2)/100;
            System.out.println("Sales Commission is " +commission);
}


}
        }
