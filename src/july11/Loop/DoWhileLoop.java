package july11.Loop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur limit");
        int number = sc.nextInt();

        int counter = 5;

        do{
            System.out.println(counter);
            counter++;
        }while(counter <= number);

    }
}
