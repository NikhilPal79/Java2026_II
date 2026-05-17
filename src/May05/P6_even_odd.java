package May05;

import java.util.Arrays;

public class P6_even_odd {
    static void main(String[] args) {
        int [] arr = {4,5,6,2,8,1};
        System.out.println("Given array : " + Arrays.toString(arr));

        System.out.println(" Find even and odd ");

        if (arr.length % 2 == 0){
            System.out.println("arr is even");
        }
        else {
            System.out.println("arr is odd");
        }
    }
}
