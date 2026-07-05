package July02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class GreetMain {
    static void main(String[] args) {


        Greeting greeting = new Greeting() {
            @Override
            public String getGreet(String name) {
                return "";
            }
        };


        Consumer<String> consumer = (e) -> System.out.println(e);
        consumer.accept("Mayank");
        System.out.println();

        List<String> list = Arrays.asList("Nikhil", "Manpreet","Samridhi");
        list.forEach(e ->  System.out.println(e));
        System.out.println();

        System.out.println(list);


        Function<String, Integer> fun = (s ) -> s.length();
        System.out.println(fun.apply("Mayank"));

    }
}
