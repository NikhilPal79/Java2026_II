package June16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("New York");
        cities.add("San Francisco");

        List<String> countries = new ArrayList<>();
        countries.add("United States");
        countries.add("United Kingdom");
        countries.add("India");
        countries.add("Japan");


        cities.addAll(1,countries);
        System.out.println(cities);



    }
}
