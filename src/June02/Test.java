package June02;

public class Test {
    static void main(String[] args) {
        String s = "nikhil";
        /*System.out.println(s.toUpperCase());

        int a =10/0;*/

        System.out.println(s);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(s.toUpperCase());


    }
}
