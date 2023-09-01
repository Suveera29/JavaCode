package August22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list,10));

    }
}
