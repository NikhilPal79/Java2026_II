package June27;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 1);
        map.put("Jerry", 2);
        map.put("Simba", 3);
        map.put("Ron", 4);
        map.put("Daniel", 5);

        System.out.println(map);

        map.putIfAbsent("Tom", 7);
        System.out.println(map);

        System.out.println(map.get("Tom"));
        System.out.println(map.getOrDefault("Jerry", 2));

        System.out.println(map.containsKey("Simba"));

        System.out.println(map.containsValue(5));
        System.out.println(map.replace("Ron", 4));

        System.out.println(map);

        map.put(null, null);
        System.out.println(map);
        System.out.println();

        System.out.println("Entry Set");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getValue());
        }
    }
}
