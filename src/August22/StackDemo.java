package August22;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.add("Suveera");// add firrst bootom
        names.add("Prachi");
        names.add("Sneha");
        names.add("Chavi");
        names.add("Siya");
        names.add("Shruti");//add last top;
        //push and pop
        //push == add element
        //pop == remove
        System.out.println(names.peek());
        System.out.println(names.pop());
        System.out.println(names.push(" Deepanshu"));
        System.out.println(names);


    }
}
