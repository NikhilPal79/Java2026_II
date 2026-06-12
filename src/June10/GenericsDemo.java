package June10;

// ============= UPPER BOUND GENERICS: <? extends Type> =============
// Accepts Type or any SUBCLASS of Type
// Use Case: When you want to READ/GET data from a collection

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}
public class GenericsDemo {

    // ============= UPPER BOUND EXAMPLE =============
    // This method accepts List of ANY type that is Animal or subclass of Animal
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();  // ✓ We can call Animal methods
        }
    }

    // ============= UPPER BOUND - Detailed Example =============
    public static void demonstrateUpperBound() {
        System.out.println("===== UPPER BOUND EXAMPLE =====");

        // Create list of Dogs
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        // Create list of Cats
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        // Both lists can be passed to printAnimals because they extend Animal
        printAnimals(dogs);  // ✓ Works! Dog extends Animal
        printAnimals(cats);  // ✓ Works! Cat extends Animal

        // ❌ This would NOT work (cannot add Dog to List<? extends Animal>)
        // printAnimals.add(new Dog());  // COMPILE ERROR!
        // Why? Because the compiler doesn't know if it's a List<Dog> or List<Cat>

        System.out.println();
    }

    // ============= LOWER BOUND EXAMPLE =============
    // This method accepts List of ANY type that is Dog or SUPERCLASS of Dog
    public static void addDogs(List<? super Dog> list) {
        list.add(new Dog());  // ✓ We can ADD Dogs to the list
        System.out.println("Added dog to list");
    }

    // ============= LOWER BOUND - Detailed Example =============
    public static void demonstrateLowerBound() {
        System.out.println("===== LOWER BOUND EXAMPLE =====");

        // Create list of Animals (superclass of Dog)
        List<Animal> animals = new ArrayList<>();
        addDogs(animals);  // ✓ Works! Animal is superclass of Dog

        // Create list of Dogs
        List<Dog> dogs = new ArrayList<>();
        addDogs(dogs);  // ✓ Works! Dog is Dog itself

        // ❌ This would NOT work
        // List<Cat> cats = new ArrayList<>();
        // addDogs(cats);  // COMPILE ERROR! Cat is not superclass of Dog

        System.out.println();
    }

    // ============= PRACTICAL COMPARISON =============
    public static void practicalExamples() {
        System.out.println("===== PRACTICAL COMPARISON =====");

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Dog());
        animalList.add(new Cat());

        // UPPER BOUND: Used for READING (getting items)
        System.out.println("Upper Bound - Reading items:");
        printAnimals(dogList);      // ✓ Can read Dog list as Animal
        printAnimals(animalList);   // ✓ Can read Animal list as Animal

        // LOWER BOUND: Used for WRITING (adding items)
        System.out.println("\nLower Bound - Writing items:");
        addDogs(dogList);           // ✓ Can add Dog to Dog list
        addDogs(animalList);        // ✓ Can add Dog to Animal list

        System.out.println();
    }

    // ============= RULE OF THUMB =============
    public static void ruleOfThumb() {
        System.out.println("===== RULE OF THUMB =====");
        System.out.println("PECS: Producer Extends, Consumer Super");
        System.out.println();
        System.out.println("1. Producer (? extends Type): When you GET/READ data");
        System.out.println("   Example: List<? extends Animal> - I'm reading animals");
        System.out.println();
        System.out.println("2. Consumer (? super Type): When you PUT/WRITE data");
        System.out.println("   Example: List<? super Dog> - I'm writing dogs");
        System.out.println();
    }

    public static void main(String[] args) {
        demonstrateUpperBound();
        demonstrateLowerBound();
        practicalExamples();
        ruleOfThumb();
    }
}
