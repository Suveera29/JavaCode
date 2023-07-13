package July8;


import java.util.Scanner;

public class SwitchCase  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number x:");
        int x = sc.nextInt();
        System.out.println("enter number y:");
        int y = sc.nextInt();

        System.out.println("enter input");
        int input = sc.nextInt();

        switch(input){
            case 1:

                System.out.println(x+y);
                break;

            case 2:

                System.out.println(x-y);
                break;

            case 3:

                System.out.println(x*y);
                break;
            case 4:

                System.out.println(x%y);
                break;

            case 5:
                System.out.println("wrong output");
            default:
                System.out.println("no input");



        }

    }
}
