package May05;

import java.util.Arrays;

public class P5_sum {
    static void main(String[] args) {
        int [] arr = {4,5,6,2,8,1};
        System.out.println("Given array : " + Arrays.toString(arr));

        System.out.println("Sum of all the elements ");

        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Sum of all the elements " + sum);
    }
}
