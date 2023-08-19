package July8;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your input");
        char ch = sc.next().charAt(0);

        if (ch == '+') {
            System.out.println("Enter number x:");
            int x = sc.nextInt();
            System.out.println("enter number y:");
            int y = sc.nextInt();
            System.out.println(x+y);

        } else if (ch == '-') {
            System.out.println("Enter number x:");
            int x = sc.nextInt();
            System.out.println("enter number y:");
            int y = sc.nextInt();
            System.out.println(x-y);
        } else if (ch == '*') {
            System.out.println("Enter number x:");
            int x = sc.nextInt();
            System.out.println("enter number y:");
            int y = sc.nextInt();
            System.out.println(x*y);
        }else if(ch=='%'){
            System.out.println("Enter number x:");
            int x = sc.nextInt();
            System.out.println("enter number y:");
            int y = sc.nextInt();
            System.out.println(x%y);
        }else{
            System.out.println("wrong output");
        }
    }
    }
