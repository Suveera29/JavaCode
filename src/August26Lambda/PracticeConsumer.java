package August26Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PracticeConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> System.out.println(name.charAt(2));
        consumer.accept("Suveera");

        Predicate<Integer> predicate = (i)-> i%2==0;
        System.out.println(predicate.test(10));

        Supplier<String> supplier = () -> "Hi";
        String s = supplier.get();
        System.out.println(s);

        Function<String,Integer> function = (string)-> string.length();
        System.out.println(function.apply("Suveera"));










    }
}
