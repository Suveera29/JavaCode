package August22;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //key/value
        Map<String, String> map = new HashMap<>();
        map.put("name", "Pragra");
        map.put("null", "123");
        map.put("name", "John");
        map.put("name1", "name");
map.putIfAbsent("name2", "Pragra2");
        System.out.println(map);

        //key can not duplicate
    }
}
