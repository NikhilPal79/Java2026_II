package May09;

import java.util.Arrays;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        int [][] marks = new int[2][2];

        System.out.println(" Enter the marks ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        for (int []e : marks) {
            System.out.println(Arrays.toString(e));
        }

        /// find the highest marks per students
        int max = marks[0][0];
        int max1 = marks[0][0];
        for  (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                /// for each row
                if(marks[i][j] > max1) {
                    max1 = marks[i][j];
                }
                /// for highest marks
                if (marks[i][j] > max) {
                    max = marks[i][j];
                }
            }
            System.out.println("max of each row  = " + max1);
        }
        System.out.println("highest marks " + max);



        /// avg marks per students

        int sum2 = 0;
        for (int i = 0; i < marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum = sum + marks[i][j] ;
                sum2 = sum2 +marks[i][j];
            }
            System.out.println("avg of each row  = " + sum/2);
        }
        System.out.println("average of all marks  = " + sum2/2);




    }
}
