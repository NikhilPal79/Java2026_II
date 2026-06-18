package June13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    static void main(String[] args) {


        List<String> fruits = new CopyOnWriteArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("pineapple");


        Iterator<String> iterator = fruits.iterator();


        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            fruits.remove("apple");
        }
        System.out.println(" USING THE CopyOnWriteArrayList<>() TO FAIL SAFE ");
        System.out.println( fruits );
    }
}
