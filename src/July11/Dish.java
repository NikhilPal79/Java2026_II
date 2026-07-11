package July11;

import java.util.List;


public class Dish {

    private String name;
    private double price;
    private DishType dishType;
    private List<String> ingredients;
    private int calories;

    public Dish(String name, double price, DishType dishType, List<String> ingredients, int calories) {
        this.name = name;
        this.price = price;
        this.dishType = dishType;
        this.ingredients = ingredients;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public DishType getDishType() {
        return dishType;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dishType=" + dishType +
                ", ingredients=" + ingredients +
                ", calories=" + calories +
                '}';
    }
}



