package July22;

import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int num[] = new int[5];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;

        for (int n:num) {

            System.out.println(n);
        }





        /*String num[] = new String[5];

        for (int i = 0; i <num.length; i++) {
            num[i] = sc.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }*/
    }
}

