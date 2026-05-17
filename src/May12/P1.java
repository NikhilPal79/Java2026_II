package May12;

import java.util.Scanner;

public class P1 {
    static void main(String[] args) {

        /// wap to count no of vowels

        char [] s = new char[10];
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your line ");
        s = sc.nextLine().toCharArray();

        System.out.println(s);

        if ((s = "a" || "e" || "i" || "o" || "u")) {
            System.out.println(s.length);
        }



    }
}
