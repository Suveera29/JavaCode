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
        char option;
        do {
            System.out.println("Enter number x:");
            int x = sc.nextInt();
            System.out.println("enter number y:");
            int y = sc.nextInt();
            System.out.println("enter number which operaton do you want ");
            int input = sc.nextInt();
            System.out.println("Ans is:");

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
            option = sc.next().charAt(0);
        }
        while (option != 'y');
        System.out.println("bye");

    }
}
