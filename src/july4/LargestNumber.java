package july4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        char input;
        do{

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1 number:");
        int x = scanner.nextInt();

        System.out.println("Enter the 2 number:");
        int y = scanner.nextInt();

        System.out.println("Enter the 3 number:");
        int z = scanner.nextInt();

            if (x >= y && x >= z) {
                System.out.println("number 1 is greater:" + x);
            } else if (y >= z && y >= x) {
                System.out.println("number 2 is greater:" + y);
            } else if (z >= y && z >= x) {
                System.out.println("number 3 is greater:" + z);
            } else if ((x == y) && (x == z) && (y == z)) {
                System.out.println("all number are equal");
            } else {
                System.out.println("invalid");
            }

                System.out.println("Do you want to exit? Press y for yes and n for no ");
                input = scanner.next().charAt(0);

        }
        while (input!= 'y');
        System.out.println("Thank you ");


    }
}



//mmain--function, method in line 2  only one main class