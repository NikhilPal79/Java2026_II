package June27;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
