package August26Lambda.Assignmnet;

public class Mian {
    public static void main(String[] args) {
        Calculator calculator = (num1, num2) -> {System.out.println("add is "+(num1+num2));
        System.out.println("sum is"+(num1-num2));
            System.out.println("multi is"+num1*num2);
            System.out.println("divide is "+num1/num2);};
        calculator.Cal(10,20);


    }
}
