package May09;

import java.util.Arrays;
import java.util.Scanner;

public class P1_2D_Array {
    static void main(String[] args) {

        /// wap 2d array

        //{{10,20,304,46},{78,946,161,15},{85,26,75,95},{62,23,36,52},{42,25,52,94}};
        int [][] marks = new int  [2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers ");

        /// taking the user input
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
                System.out.print(marks[i][j]);
            }
            System.out.println();

            /// printing the matrix
        }
        for ( int[] e : marks){
            System.out.println(Arrays.toString(e));
        }

        /// wap to sum of each row and sum of all elements

        int sum2 = 0;
        for (int i = 0; i < marks.length; i++) {
            int sum = 0;

            for (int j = 0; j < marks[i].length; j++) {
                 sum = sum + marks[i][j];
                sum2 =  sum2 + marks[i][j];
            }
            System.out.println("Sum of each array : " + sum);
            System.out.println("Avg of each array : " + sum / 2);
        }
        System.out.println("Sum of all the elements of the array : " + sum2);



    }
}
