package June13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo {
    static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("lemon");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            fruits.remove("apple");
        }

        ///traverse the two function in single loop giving the ConcurrentModification


    }
}
