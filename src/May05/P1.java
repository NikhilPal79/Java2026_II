package May05;

import java.util.Scanner;

public class P1 {
    static void main(String[] args) {

        int [] rollNo = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println(" Entering the 10 roll numbers ");
        for(int i=0;i<rollNo.length;i++){
            rollNo[i] = sc.nextInt();
        }

        System.out.println(" Saving the 10 roll numbers  : ");
        for (int j : rollNo) {
            System.out.println(j);

        }




    }
}
