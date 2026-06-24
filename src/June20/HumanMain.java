package June20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HumanMain {
    static void main(String[] args) {

        Set<String> humans = new HashSet<String>();
        humans.add( "Jerry");
        humans.add("JOHN");
        humans.add( "TOM");
        humans.add( "POTTER");
        System.out.println(humans);


        System.out.println();
        System.out.println(" FOR EACH ");

        for (String e :  humans) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("TRADITIONAL");
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.getClass());
        }
        System.out.println();

        System.out.println("ITERATORS");

        Iterator<String> iterator = humans.iterator();
        while (iterator.hasNext()) {
            String  nexted = iterator.next();
            if (nexted.equals("POTTER")) {
                iterator.remove();
            }
        }
        System.out.println("Potter removed "+ humans);

    }
}
