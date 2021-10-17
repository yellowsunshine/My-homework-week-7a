package homeworkfolder;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20&amp; : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

public class Question5 {

    static int employeeId, x, y, z, w;
    static String name;
    static int basicSalary;

    public static void main(String[] args) {

        Scanner salary = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        name = salary.nextLine();

        System.out.println("Enter your EmployeeID: ");
        employeeId = salary.nextInt();

        System.out.println("Enter Basic Salary: ");
        basicSalary = salary.nextInt();
        salary.close();


        int gs= basicSalary+hRA()+da()+ta()-pf();

        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:"+employeeId+"                     |");
        System.out.println("|Employee Name:"+name+"                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary+"                  |");
        System.out.println("|HRA 10%:  " + hRA() +"                       |");
        System.out.println("|TA 8%: "+ ta() + "                          |");
        System.out.println("|DA 9%: " + da() + "                          |");
        System.out.println("|PF -20%: " + pf() + "                        |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: "+gs+ "                  |");
        System.out.println("|-------------------------------------|");

    }
    public static int hRA (){
        x = (basicSalary*10)/100;
        return x;
    }

    public static int da(){
       y = (basicSalary*8)/100;
       return y;
    }

    public static int ta(){
        z = (basicSalary*9)/100;
        return z;
    }
    public static int pf(){
        w = (basicSalary*20)/100;
        return w;
    }



}
