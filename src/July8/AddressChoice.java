package July8;

import java.util.Scanner;

public class AddressChoice {
    public static void main(String[] args) {
        System.out.println("1. Pragra = 110 matheson Blvd");
        System.out.println("2. CN tower = Bremner blvd");
        System.out.println("3. Toronto Zoo = Meadwale road");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        String name = sc.nextLine();

        switch(name){
            case "pragra":
                System.out.println("110 matheson Blvd");
                break;
            case "CN tower":
                System.out.println("Bremner blvd");
                break;
            case "Toronto Zoo":
                System.out.println("Meadwale road");
                break;
            default:
                System.out.println("wrong input");
        }



    }
}
