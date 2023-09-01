package August26Lambda.Calculator;

public class MainClacultor {
    public static void main(String[] args) {
        Calculator calculator = (num1, num2) -> System.out.println(num1+" "+num2);
        calculator.calculator(10,20);
    }
}
