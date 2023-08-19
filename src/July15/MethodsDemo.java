package July15;

import July8.CalculatorDemo;

public class MethodsDemo {
    public static void main(String[] args) {
        //System.out.println("sum of three number:"+MoreMethods.sum(10, 20, 20));
        //int total = MoreMethods.sum(10,20,30);
        //System.out.println("sum is :"+total);
       //CalculatorMethod.cal();

        Animal animal = new Animal();
        animal.age = 12;
        animal.colour = "White";
        animal.eyes = 2;
        Animal.milk();
        Animal.eating();
        System.out.println("Cow age is:"+animal.age);
        System.out.println("Cow colour is: "+animal.colour);
        System.out.println("Cow eyes are :"+animal.eyes);


    }
}