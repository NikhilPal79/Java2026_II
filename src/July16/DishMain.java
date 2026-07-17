package July16;

import July11.Dish;
import July11.DishType;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishMain {
    static void main(String[] args) {

        List<July11.Dish> dishes = new ArrayList<>();
        dishes.add(new July11.Dish("Pasta",45, DishType.VEG,List.of("Pasta","Mayo","Tomato"),600));
        dishes.add(new July11.Dish("Tacos",85,DishType.VEG,List.of("Pasta","Mayo","Tomato"),800));
        dishes.add(new July11.Dish("Samosa",25,DishType.VEGAN,List.of("Pasta","Mayo","Tomato"),200));
        dishes.add(new July11.Dish("Burger",35,DishType.VEGAN,List.of("Pasta","Mayo","Tomato"),400));
        dishes.add(new July11.Dish("Biryani",65,DishType.NON_VEG,List.of("Pasta","Mayo","Tomato"),300));
        dishes.add(new July11.Dish("Butter Chicken",75,DishType.NON_VEG,List.of("Pasta","Mayo","Tomato"),900));
        dishes.add(new July11.Dish("Butter Chicken",75,DishType.NON_VEG,List.of("Pasta","Mayo","Tomato"),900));

        System.out.println(dishes);
        System.out.println();

        dishes.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("USE OF OPTIONAL");

        Optional<Dish> first = dishes.stream().filter(d->d.getDishType() == DishType.NON_VEG).skip(1).findFirst();
        if (first.isPresent()) {
            System.out.println("first.get()" + first.get());

        }else {
            System.out.println("No Non-Veg");
        }

        System.out.println();
        System.out.println("I WANT TO CLEAR SEGREGATED VEG AND NON-VEG DISHES ");
        System.out.println();

        Map<DishType, List<Dish>> dishTypeListMap = dishes.stream().collect(Collectors.groupingBy(Dish::getDishType));
        System.out.println("dishTypeListMap" + dishTypeListMap);

        System.out.println();
        System.out.println("I WANT TO COUNT THE DISHES TYPE ");
        System.out.println();

        Map<DishType, Long> longMap = dishes.stream().collect(Collectors.groupingBy(Dish::getDishType, Collectors.counting()));
        System.out.println("LongMapList " + longMap);

        System.out.println();
        System.out.println("INTERVIEW QUESTION");
        System.out.println();

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Integer multiply = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Multiply = " + multiply);

        Integer calorySum = dishes.stream().map(Dish::getCalories).reduce(1, (a, b) -> a+b);
        System.out.println("Total calory = " + calorySum);

        System.out.println();
        System.out.println("find te sum of all the salaries of the emp dept");
        System.out.println("find the sum of calories by the dish type ");
        System.out.println();

        Map<DishType, Integer> doubleMap = dishes.stream().collect(Collectors.groupingBy(Dish::getDishType, Collectors.summingInt(Dish::getCalories)));
        System.out.println("Double Map = " + doubleMap);

        System.out.println();
        System.out.println("All ingredient to prepare dishes by HashSet");
        System.out.println();

        Set<String>  shoppingList = new HashSet<>();
        for(Dish dish : dishes){
            for (String ingredients : dish.getIngredients()){
                shoppingList.add(ingredients);
            }
        }
        System.out.println("shopping list = " + shoppingList);

        System.out.println();
        System.out.println("All ingredient to prepare dishes by Streams ");
        System.out.println();

        Set<String> stringSet = dishes.stream().map(Dish::getIngredients).flatMap(i -> i.stream()).collect(Collectors.toSet());
        System.out.println("String set = " + stringSet);


    }
}
