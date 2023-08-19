package July8;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number:");
        int number = sc.nextInt();
        String result = (number%2 ==0) ? "even":"odd";
        System.out.println(result);
    }
}
