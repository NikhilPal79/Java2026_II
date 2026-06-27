package June27;

import java.util.*;

public class P2 {
    static void main(String[] args) {


        System.out.println(" Find Duplicates ");


        List<Integer> integers = List.of(1, 3, 5, 2, 2, 5);

        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();

        for (Integer num : integers) {
            map.put(num,map.getOrDefault(num,0) + 1);
            if(map.get(num) > 1){
                set.add(num);
            }
        }
        System.out.println(set);
    }
}
