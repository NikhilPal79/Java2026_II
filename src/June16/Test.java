package June16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        System.out.println(list.get(3));
    }
}
