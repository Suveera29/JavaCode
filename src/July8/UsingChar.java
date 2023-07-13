package July8;

import java.util.Scanner;

public class UsingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number x:");
        int x = sc.nextInt();
        System.out.println("enter number y:");
        int y = sc.nextInt();
        System.out.println("Enter your choice");
        char ch = sc.next().charAt(0);
        System.out.println("your ch is : ");

        switch(ch){
            case '+' :
                System.out.println(x+y);
                break;

            case '-':
                System.out.println(x-y);
                break;
            case '%':
                System.out.println(x*y);
                break;
            case '*':
                System.out.println(x%y);
                break;
            default:
                System.out.println("wrong output");

        }

    }


}
