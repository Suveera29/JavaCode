package july11.Loop;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        int n = sc.nextInt();
        System.out.println("The first n natural number are:"+n);
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("the sum of natural number is"+sum);
    }
}
