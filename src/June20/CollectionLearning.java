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
        System.out.println(names);

        Set<String> set = new HashSet<>();
        set.add("nikhil");
        set.add("nikhil");
        set.add("manpreet");
        System.out.println(set);
    }
}
