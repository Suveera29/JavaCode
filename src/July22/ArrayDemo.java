package July22;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];
        System.out.println("Enter the value:");


        for (int i = 0; i <num.length; i++) {
           num[i] = sc.nextInt();
            }
        /*for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }*/

        for (  int m: num  ) {
            System.out.println(m);

        }
    }


}
