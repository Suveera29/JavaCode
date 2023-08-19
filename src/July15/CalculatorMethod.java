package July15;

import java.util.Scanner;

public class CalculatorMethod {
    public static void cal() {

        Scanner sc = new Scanner(System.in);
        char user_input;

        do {

            System.out.println("for addition press       1");
            System.out.println("for subtraction press    2");
            System.out.println("for multiplication press 3");
            System.out.println("Enter the calculator option: ");
            int input = sc.nextInt();
            System.out.println("Enter 1 number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter 2 number:");
            int num2 = sc.nextInt();
            System.out.println("Enter 3 number:");
            int num3 = sc.nextInt();

            if (input == 1) {
                System.out.println("ans is:"+CalculatorMethod.addition(num1, num2));


            } else if (input == 2) {
                System.out.println("ans is : "+CalculatorMethod.sub(num1, num2));
            } else if (input == 3) {
                System.out.println("ans is: "+CalculatorMethod.multi(num1, num2));
            }
            else if(input==4){
                System.out.println(CalculatorMethod.addition(num1, num2, num3));
            }
            System.out.println("Do you want to exit? if yes press y otherwise press no");
            user_input = sc.next().charAt(0);
        }
        while (user_input != 'y');
        System.out.println("thank you, bye");
    }

        public static int addition ( int num1, int num2){
            return num1 + num2;
        }
        public static int addition ( int num1, int num2, int num3)
        {
        return num1 + num2+ num3;
    }

        public static int sub ( int num1, int num2){
            return num1 - num2;

        }

        public static int multi ( int num1, int num2){
            return num1 * num2;
        }

}
