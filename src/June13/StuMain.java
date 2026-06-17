package June13;

import java.util.ArrayList;
import java.util.List;

public class StuMain {
    static void main(String[] args) {

        List<Integer> stu = new ArrayList<>();
        stu.add(12);
        stu.add(32);
        stu.add(95);
        stu.add(488);
        stu.add(58);
        System.out.println(stu);


        System.out.println("return boolean :- " + stu.add(99));
        stu.add(5,9999);
        System.out.println(stu.get(2));
        stu.addFirst(7);
        stu.addLast(666);
        /*stu.clear();*/
        System.out.println(stu.contains(666));
        System.out.println(stu.equals(9999));
        System.out.println(stu.size());

        System.out.println(stu);


    }
}
