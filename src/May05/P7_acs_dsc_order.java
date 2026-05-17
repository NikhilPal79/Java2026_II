package May05;

import java.util.Arrays;

public class P7_acs_dsc_order {
    static void main(String[] args) {

        int [] arr = {4,5,6,2,8,1};
        System.out.println("Given array : " + Arrays.toString(arr));
        Arrays.sort(arr);
        String asc_arr = Arrays.toString(arr);
        System.out.println("Asc order : " + asc_arr);

        /// reverse the asc order
        for (int i = asc_arr.length()-1; i >=0 ; i--) {
        }

        System.out.println("Desc order of array :" + asc_arr);



    }
}
