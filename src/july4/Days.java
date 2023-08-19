package july4;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        x = scanner.nextInt();

        if(x==1){
            System.out.println("Sunday");
        }
        else if(x==2){
        System.out.println("Monday");
        }
        else if(x==3){
            System.out.println("Tuesday");
        }else if(x==4){
            System.out.println("Wednesday");
        }
        else if(x==5){
            System.out.println("Thursday");
        }
        else if(x==6){
            System.out.println("friday");
        }
        else if(x==7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("invalid input");
        }


    }
}

