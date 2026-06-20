package June20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



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
