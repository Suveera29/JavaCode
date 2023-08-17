package July25;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente the interger number");
        int num = sc.nextInt();

        System.out.println("Enter the name");
        String name = sc.next();

        System.out.println(" number is:"+ num);
        System.out.println("string is:"+ name);
    }
}
