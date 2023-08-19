package July8;

import java.util.Scanner;

public class CustomerDemoClass {
    public static void main(String[] args) {
        System.out.println("Choose 1 for english");
        System.out.println("Choose 2 for French");
        Scanner sc = new Scanner(System.in);
        char options;
        System.out.println("enter your choice");
        int input = sc.nextInt();
        do{
            switch(input) {
                case 1:
                    System.out.println("go for english");
                    break;
                case 2:
                    System.out.println("go for french");
                    break;
                default:
                    System.out.println("Thank you for calling us");
            }
                        System.out.println("Which option do you want");
                        System.out.println("Transfe a call to manager press 1");
                        System.out.println("IF you are satisfied press 2");
                        int option = sc.nextInt();
                        char ans;
                        if (option == 1) {
                            System.out.println("We will transfer your call to assistant manager");
                        } else if (option == 2) {
                            System.out.println("if you are okay,press the following option");
                            }
                        System.out.println("Now if you want to leave press y for yes and no for no");
                        options = sc.next().charAt(0);
                        if (options == 'y') {
                            System.out.println("Now you are good to go");

                        } else if (options != 'n') {
                            System.out.println("Okay, We will transfer your call to assistant manager again");

                        }
        }
        while(options!='y');
        System.out.println("thank you");

    }
}