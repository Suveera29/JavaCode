package July8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Addition press       1");
        System.out.println("Subtraction press    2");
        System.out.println("Multiplication press 3");
        System.out.println("Division press       4");

        Scanner sc = new Scanner(System.in);
        String option;
        do {
            System.out.println("Enter number x:");
            int x = sc.nextInt();
            System.out.println("enter number y:");
            int y = sc.nextInt();
            System.out.println("enter number which operaton do you want ");
            int input = sc.nextInt();


            if (input == 1) {
                System.out.println(x + y);
            } else if (input == 2) {
                System.out.println(x - y);
            } else if (input == 3) {
                System.out.println(x * y);
            } else if (input == 4) {
                System.out.println(x % y);
            } else {
                System.out.println("wrong output");
            }
            System.out.println("Do you want to continue press y for yes and n for no");
            option = sc.next();
            System.out.println("enter number z:");
            int z = sc.nextInt();
            System.out.println("enter number which operation do you want");
            int inp = sc.nextInt();
            if (inp == 1) {
                System.out.println(x + y+z);
            } else if (inp == 2) {
                System.out.println(x - y-z);
            } else if (inp == 3) {
                System.out.println(x * y*z);
            } else if (inp == 4) {
                System.out.println(x % y%z);
            } else {
                System.out.println("wrong output");
            }
            System.out.println("Do you want to continue press y for yes and n for no");
            option = sc.next();


        }
        while (option == "n");
            System.out.println("bye");

    }
}
