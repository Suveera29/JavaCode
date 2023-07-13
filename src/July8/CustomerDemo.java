package July8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomerDemo {
    public static void main(String[] args) {
        System.out.println("Choose 1 for english");
        System.out.println("Choose 2 for French");
        Scanner sc = new Scanner(System.in);
        String options;
        System.out.println("enter your choice");
        int input = sc.nextInt();


        switch(input){
            case 1:
                System.out.println("go for english");
                System.out.println("Which option do you want");
                System.out.println("Transfe a call to manager press 1");
                System.out.println("IF you are satisfied press 2");
                int option = sc.nextInt();
                if(option==1){
                    System.out.println("We will transfer your call to assistant manager");
                }else if(option ==2) {
                    System.out.println("is there anything else i can help you?");
                }do{
                    System.out.println("Now if you want to leave press y for yes and no for no");
                    options = sc.next();
                    if(options=="y") {
                        System.out.println("Now are you good to go?");

                    }
                    else if(options=="n"){
                        System.out.println("Okay, We will transfer your call to assistant manager again");

                    }
                    }
                    while(options=="n");
                        System.out.println("thank you");


                    break;

            case 2:
                System.out.println("go for french");
                System.out.println("Which option do you want");
                int french = sc.nextInt();
                if(french==1){
                    System.out.println("We will transfer your call to assistant manager");
                }else if(french ==2){
                    System.out.println("is there anything else i can help you");
                }
                System.out.println("Thank you for calling us");
                break;
            default:
                System.out.println("Thank you for calling us, byee");
        }
    }
}
