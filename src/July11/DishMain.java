package July11;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DishMain {
    static void main(String[] args) {

        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Pasta",45,DishType.VEG,List.of("Pasta","Mayo","Tomato"),600));
        dishes.add(new Dish("Tacos",85,DishType.VEG,List.of("Pasta","Mayo","Tomato"),800));
        dishes.add(new Dish("Samosa",25,DishType.VEGAN,List.of("Pasta","Mayo","Tomato"),200));
        dishes.add(new Dish("Burger",35,DishType.VEGAN,List.of("Pasta","Mayo","Tomato"),400));
        dishes.add(new Dish("Biryani",65,DishType.NON_VEG,List.of("Pasta","Mayo","Tomato"),300));
        dishes.add(new Dish("Butter Chicken",75,DishType.NON_VEG,List.of("Pasta","Mayo","Tomato"),900));
        dishes.add(new Dish("Butter Chicken",75,DishType.NON_VEG,List.of("Pasta","Mayo","Tomato"),900));

        System.out.println(dishes);
        System.out.println();

        dishes.stream().forEach(System.out::println);
        System.out.println();

        dishes.stream().filter(d -> d.getDishType() == DishType.VEG).forEach(System.out::println);
        System.out.println();

        dishes.stream()
                .filter( b-> b.getCalories()> 500)
                .filter(b-> b.getDishType() == DishType.VEG)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println();

        List<String> collected = dishes.stream()
                .map(Dish::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Dish Name " + collected);
        System.out.println();

        double sum =0;

        for (Dish d : dishes) {
            sum += d.getPrice();
        }
        System.out.println( "Dish total Price "+ sum);
        System.out.println();

        System.out.println(" Total Price By Stream " + dishes.stream().mapToDouble(Dish::getPrice).sum());

        System.out.println(" Total Calories By Stream " +dishes.stream().mapToInt(Dish::getCalories).sum());
        System.out.println();
        System.out.println(" Total Calories Of Veg Items By Stream " +dishes.stream()
                .filter(dish ->  dish.getDishType() == DishType.VEG)
                        .mapToInt(Dish::getCalories).sum());
        System.out.println();


        IntSummaryStatistics intSummaryStatistics = dishes.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println("for calories " + intSummaryStatistics);
        System.out.println();

        DoubleSummaryStatistics doubleSummaryStatistics = dishes.stream().collect(Collectors.summarizingDouble(Dish::getPrice));
        System.out.println("for price " + doubleSummaryStatistics);
    }
}
