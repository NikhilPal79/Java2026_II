package June25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    static void main(String[] args) {


        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> nums = new ArrayList<>(num);
        List<Integer> nums1 = new LinkedList<>(num);
        System.out.println(nums1);
        System.out.println(nums1);;
    }
}
