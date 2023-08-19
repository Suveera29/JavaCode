package july11.Loop;

import java.util.Scanner;

public class FiveNumberFromKeyboard {
    public static void main(String[] args) {
        int sum =0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 number from keyboard:");

        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            sum += x;
        }
            System.out.println("Sum of 5 number is:"+sum);
            avg=sum/5;
            System.out.println(avg);
    }
}
