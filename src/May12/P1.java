package May12;

import java.util.Scanner;

public class P1 {
    static void main(String[] args) {

        /// wap to count no of vowels

        String a = "Hello World";

        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                count = count + 1;
            }
        }
        System.out.println(count);


    }
}
