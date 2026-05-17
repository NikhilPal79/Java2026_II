package May05;

import java.util.Arrays;

public class P4_mini_max {
    static void main(String[] args) {

        int [] arr = {4,5,6,2,8,1};
        System.out.println("Given array : " + Arrays.toString(arr));

        System.out.println(" Find max ");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(" maximum of array " + max);


        System.out.println(" Find mini");

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(" minimum of array " + min);


    }
}
