package June20;

import java.util.HashSet;
import java.util.Set;

public class HumanMain {
    static void main(String[] args) {

        Set<Human> humans = new HashSet<Human>();
        humans.add(new Human(20, "Jerry"));
        humans.add(new Human(20, "Jerry"));
        System.out.println(humans);

    }
}
