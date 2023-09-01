package August26Lambda;

import java.util.function.*;

public class ConsumerDemo {
    public static void main(String[] args) {
        //return nothing accept 1 parameter
        Consumer<String> consumer = (st) -> System.out.println(st.trim());
        consumer.accept("  PRAGRA  ");
//return nothing accept tep parameter
        BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> System.out.println(num1 + num2);
        biConsumer.accept(10, 20);
//booleen valued finction, return boolean value and accept 1 input
        Predicate<Integer> predicate = (i) -> i % 2 == 0;
        System.out.println(predicate.test(5));
        //input nothing return value
        Supplier<String> supplier = () -> "Hi";
        String s = supplier.get();
        System.out.println(s);

        Supplier<Integer> supplier1 = () ->10;
        Integer s1 = supplier1.get();
        System.out.println(s1);


//Function
        Function<String, Integer> function = (st)-> st.length();
        System.out.println(function.apply("Pragra"));





    }
}
