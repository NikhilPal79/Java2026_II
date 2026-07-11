package July11;

import java.util.stream.Stream;

public class StreamPractice {
    static void main(String[] args) {


        Stream<String> stringStream = Stream.generate(() -> "Hello World");

        stringStream.forEach(System.out::println);
    }
}
