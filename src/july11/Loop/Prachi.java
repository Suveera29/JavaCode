package july11.Loop;

import java.util.Scanner;

public class Prachi {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            char yes;
            do {
                System.out.println("1. Addition");
                System.out.println("2. Subtract");
                System.out.println("3. Product");
                System.out.println("4. Divide");
                System.out.println("5. Modulo");
                System.out.println("Enter your number1 : ");
                int number1 = sc.nextInt();
                System.out.println("Enter your number2 : ");
                int number2 = sc.nextInt();
                System.out.println("Enter your choice : ");
                int ans = sc.nextInt();
                System.out.println("Ans is : ");
                switch (ans) {
                    case 1:
                        System.out.println(number1 + number2);
                        break;
                    case 2:
                        System.out.println(number1 - number2);
                        break;
                    case 3:
                        System.out.println(number1 * number2);
                        break;
                    case 4:
                        System.out.println(number1 / number2);
                        break;
                    case 5:
                        System.out.println(number1 % number2);
                        break;
                    default:
                        System.out.println("Invalid ans");
                }

                System.out.println("your process is done");
                System.out.println("for taking exit you press y for yes and n for no");
                yes = sc.next().charAt(0);
            }

            while(yes != 'y');


        }
    }
