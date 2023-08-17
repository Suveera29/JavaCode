package july11.Loop;

import java.util.Scanner;

public class CubeOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("Number is "+i+"and cube of "+i+"is this:"+i*i*i);

        }

    }
}
