package july4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year: ");
        year = scanner.nextInt();

        if(year%2==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It's not a leap year");
        }
    }
}
