package June10;

import java.util.ArrayList;
import java.util.List;
// ============= ADVANCED GENERICS WITH COLLECTIONS =============
public class AdvancedGenericsDemo {


    // ============= UPPER BOUND: <? extends Type> =============
    // Can only READ from the collection
    // Cannot ADD to the collection (except null)

    /**
     * Sums all numbers in a list
     * Accepts List of Number or any subclass (Integer, Double, Float, etc.)
     */
    public static double sumList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();  // ✓ Reading is safe
        }
        return sum;
    }

    /**
     * Demonstrates why we can't write to upper bound collections
     */
    public static void upperBoundRestrictions(List<? extends Number> numbers) {
        // ✓ Can READ
        for (Number num : numbers) {
            System.out.println(num);
        }

        // ❌ Cannot ADD (except null)
        // numbers.add(10);           // COMPILE ERROR!
        // numbers.add(10.5);         // COMPILE ERROR!
        // numbers.add(new Integer(5)); // COMPILE ERROR!
        // numbers.add(null);         // ✓ This would work (null is compatible)
    }

    // ============= LOWER BOUND: <? super Type> =============
    // Can only WRITE to the collection
    // Reading gives you Object, not the specific type

    /**
     * Adds multiple integers to a collection
     * Accepts List of Integer or any SUPERCLASS (Number, Object, etc.)
     */
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Added 3 integers");
    }

    /**
     * Demonstrates why we can't easily read from lower bound collections
     */
    public static void lowerBoundRestrictions(List<? super Integer> list) {
        // ✓ Can WRITE
        list.add(10);  // Adding Integer is always safe

        // ❌ Cannot READ as Integer (would be Object)
        // Integer num = list.get(0);  // COMPILE ERROR!
        // Can only read as Object
        Object obj = list.get(0);  // ✓ This works but we get Object
        System.out.println(obj);
    }

    // ============= PRACTICAL EXAMPLE: Collection Operations =============

    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return name + " (" + score + ")";
        }
    }

    static class GraduateStudent extends Student {
        GraduateStudent(String name, int score) {
            super(name, score);
        }
    }

    /**
     * Read operation - UPPER BOUND
     * Copies all students (including subclasses) to a new list
     */
    public static List<Student> copyStudents(List<? extends Student> source) {
        List<Student> destination = new ArrayList<>();
        for (Student student : source) {
            destination.add(student);  // ✓ Can add because we know they're Students
        }
        return destination;
    }

    /**
     * Write operation - LOWER BOUND
     * Fills a collection with students
     */
    public static void fillWithStudents(List<? super Student> list) {
        list.add(new Student("Alice", 85));
        list.add(new Student("Bob", 90));
        list.add(new Student("Charlie", 78));
    }

    // ============= COMPARISON TABLE =============
    public static void printComparisonTable() {
        System.out.println("\n========== UPPER BOUND vs LOWER BOUND ==========\n");
        System.out.println("┌─────────────────┬────────────────────────┬──────────────────────┐");
        System.out.println("│     Aspect      │    UPPER BOUND         │   LOWER BOUND        │");
        System.out.println("│                 │   (? extends Type)     │   (? super Type)     │");
        System.out.println("├─────────────────┼────────────────────────┼──────────────────────┤");
        System.out.println("│ Accepts         │ Type & Subclasses      │ Type & Superclasses  │");
        System.out.println("│ Best used for   │ READING/GETTING        │ WRITING/PUTTING      │");
        System.out.println("│ Can ADD?        │ NO (only null)         │ YES                  │");
        System.out.println("│ Can READ as?    │ Type (specific)        │ Object (generic)     │");
        System.out.println("│ Use case        │ Covariance (Consumer)  │ Contravariance       │");
        System.out.println("│ PECS Rule       │ Producer Extends       │ Consumer Super       │");
        System.out.println("└─────────────────┴────────────────────────┴──────────────────────┘");
    }

    public static void main(String[] args) {
        System.out.println("========== UPPER BOUND EXAMPLES ==========\n");

        // Upper bound example 1: Sum numbers
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        System.out.println("Sum of integers: " + sumList(integers));

        // Upper bound example 2: Different number types
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(2.5);
        doubles.add(3.0);
        System.out.println("Sum of doubles: " + sumList(doubles));

        System.out.println("\n========== LOWER BOUND EXAMPLES ==========\n");

        // Lower bound example 1: Add to Integer list
        List<Integer> intList = new ArrayList<>();
        addIntegers(intList);
        System.out.println("Integer list: " + intList);

        // Lower bound example 2: Add to Object list
        List<Object> objList = new ArrayList<>();
        addIntegers(objList);
        System.out.println("Object list: " + objList);

        System.out.println("\n========== PRACTICAL STUDENT EXAMPLE ==========\n");

        // Create different types of student lists
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ram", 85));

        List<GraduateStudent> gradStudents = new ArrayList<>();
        gradStudents.add(new GraduateStudent("Sita", 95));

        // Upper bound: Can read from either list
        System.out.println("Students (copied): " + copyStudents(students));
        System.out.println("Grad Students (copied): " + copyStudents(gradStudents));

        // Lower bound: Can write to either list
        System.out.println("\nFilling student list:");
        fillWithStudents(students);
        System.out.println("After fill: " + students);

        List<Object> objectList = new ArrayList<>();
        System.out.println("\nFilling object list:");
        fillWithStudents(objectList);
        System.out.println("After fill: " + objectList);

        printComparisonTable();
    }
}




