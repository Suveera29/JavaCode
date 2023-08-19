package july11.Loop;

import java.util.Scanner;

public class TableOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int given_number = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            int number = i*given_number;
            System.out.println(given_number+"*"+i+"="+number);

        }
    }
}
