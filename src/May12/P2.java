package May12;

public class P2 {
    static void main(String[] args) {

        /// palindrome

        String s = "madam";


       for  (int i = 1; i < s.length()/2; i++) {
           if (s.charAt(i) != s.charAt(s.length()-1-i)) {

           }
       }System.out.println(s + " is palindrome");

    }
}
