package May05;

import java.util.Arrays;

public class P3 {
    static void main(String[] args) {

        /// wap to reverse an array

        int [] arr = {4,5,6,2,8,1};
        System.out.println("Given array : " + Arrays.toString(arr));
        System.out.println("first way to reverse ");
        for (int i = arr.length - 1 ; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("second way to reverse ");
        for (int i = 0; i <= arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int e : arr) {
            System.out.println(e);

        }
    }
}
