package August22;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//does not allow duplicates
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

        //hashset---no order
        //treeset-- strated order
        //linkedhasset--maintain insertion order
    }
}

