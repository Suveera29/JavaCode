package July18;

import java.util.Scanner;

public class CalculatorDemo {
    static double PI = 3.14;
    double radius;

    public CalculatorDemo(double radius) {
    this.radius = radius;
    }
    public static double calulatorArea(double input){
        return PI *input*input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = sc.nextDouble();

        System.out.println(calulatorArea(radius));

    }
}
