package August26Lambda.Assignmnet;

public class Main {
    public static void main(String[] args) {
    /*    Calculator calculator = (num1, num2) -> {System.out.println("add is "+(num1+num2));
        System.out.println("sum is"+(num1-num2));
            System.out.println("multi is"+num1*num2);
            System.out.println("divide is "+num1/num2);};
        calculator.Cal(10,20);*/

        Calculator add = (num1,num2)-> System.out.println(num1+num2);
        Calculator sub = (num1, num2) -> System.out.println(num1-num2);
        Calculator multi = (num1, num2) -> System.out.println(num1*num2);

        add.Cal(10,20);
        sub.Cal(20,10);
        multi.Cal(20,10);


    };
}
