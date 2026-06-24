package June20;

import java.util.*;


public class CollectionLearning {
    static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("nikhil");
        names.add("nikhil");
        names.add("manpreet");
        names.add(3,"reet");
        names.addAll(List.of("jerry", "tom","shanks"));
        System.out.println(names);

        List<String> names2 = new ArrayList<>();
        names2.add("harry");
        names2.add("potter");
        names2.add("black");
        System.out.println(names2.addAll(0, names));

        names2.addAll(1,names);
        System.out.println(names2);
        /*System.out.println(names);*/

        Set<String> set = new HashSet<>();
        set.add("nikhil");
        set.add("nikhil");
        set.add("manpreet");
        System.out.println(set);
    }
}
