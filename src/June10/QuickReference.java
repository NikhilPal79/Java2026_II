package June10;

/// QUICK REFERENCE: UPPER BOUND vs LOWER BOUND GENERICS
public class QuickReference {

     /*
    ╔════════════════════════════════════════════════════════════════════════════════════╗
    ║                     UPPER BOUND: <? extends Type>                                  ║
    ╠════════════════════════════════════════════════════════════════════════════════════╣
    ║                                                                                    ║
    ║  Syntax: List<? extends Animal>                                                   ║
    ║  Meaning: "A List of Animal or any subclass of Animal"                            ║
    ║                                                                                    ║
    ║  ✓ CAN:                                                                            ║
    ║    - Read/GET items as Animal type                                                ║
    ║    - Iterate through the collection                                               ║
    ║    - Use any Animal methods on items                                              ║
    ║                                                                                    ║
    ║  ✗ CANNOT:                                                                         ║
    ║    - Add items to the collection (except null)                                    ║
    ║    - Why? Compiler doesn't know if it's List<Dog> or List<Cat>                   ║
    ║                                                                                    ║
    ║  Use Case: READING/PRODUCING DATA                                                 ║
    ║  Example: sumList(List<? extends Number> numbers) - to read numbers               ║
    ║                                                                                    ║
    ║  Hierarchy:                                                                        ║
    ║      Object                                                                        ║
    ║        ↑                                                                           ║
    ║      Animal                                                                        ║
    ║      ↑  ↑  ↑                                                                      ║
    ║    Dog Cat Bird  ← All these can be accepted                                       ║
    ║                                                                                    ║
    ╚════════════════════════════════════════════════════════════════════════════════════╝

    ╔════════════════════════════════════════════════════════════════════════════════════╗
    ║                     LOWER BOUND: <? super Type>                                    ║
    ╠════════════════════════════════════════════════════════════════════════════════════╣
    ║                                                                                    ║
    ║  Syntax: List<? super Dog>                                                        ║
    ║  Meaning: "A List of Dog or any superclass of Dog"                                ║
    ║                                                                                    ║
    ║  ✓ CAN:                                                                            ║
    ║    - Add/PUT Dog objects to the collection                                        ║
    ║    - Add items safely (always upcast-compatible)                                  ║
    ║                                                                                    ║
    ║  ✗ CANNOT:                                                                         ║
    ║    - Read items as Dog type (only as Object)                                      ║
    ║    - Why? List could be List<Animal> or List<Object>                              ║
    ║                                                                                    ║
    ║  Use Case: WRITING/CONSUMING DATA                                                 ║
    ║  Example: addDogs(List<? super Dog> list) - to add dogs                           ║
    ║                                                                                    ║
    ║  Hierarchy:                                                                        ║
    ║      Object  ← Can accept                                                         ║
    ║        ↑                                                                           ║
    ║      Animal  ← Can accept                                                         ║
    ║        ↑                                                                           ║
    ║       Dog    ← Can accept (exactly this type)                                      ║
    ║                                                                                    ║
    ╚════════════════════════════════════════════════════════════════════════════════════╝

    REMEMBER: PECS (Producer Extends, Consumer Super)

    • PRODUCER (? extends T): Use when reading from the collection
    • CONSUMER  (? super T):  Use when writing to the collection
    */

    // Example 1: UPPER BOUND - Reading from a list
    static void printNumbers(java.util.List<? extends Number> numbers) {
        // ✓ Can read
        for (Number n : numbers) {
            System.out.println(n);
        }
        // ✗ Cannot add: numbers.add(5);  // ERROR!
    }

    // Example 2: LOWER BOUND - Writing to a list
    static void addNumbers(java.util.List<? super Integer> numbers) {
        // ✓ Can add
        numbers.add(10);
        numbers.add(20);
        // ✗ Cannot read as Integer: Integer x = numbers.get(0);  // ERROR!
        //   Can only read as Object
        Object obj = numbers.get(0);
    }

    // Example 3: UPPER BOUND - Generic comparison
    static <T extends Number> double getSum(java.util.List<T> list) {
        double sum = 0;
        for (T num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("✓ Created GenericsDemo.java and AdvancedGenericsDemo.java");
        System.out.println("\nRun these files to see practical examples:");
        System.out.println("  1. java -cp out/production/Apr_2026 jun10.GenericsDemo");
        System.out.println("  2. java -cp out/production/Apr_2026 jun10.AdvancedGenericsDemo");

        System.out.println("\n" + "=".repeat(80));
        System.out.println("KEY POINTS:");
        System.out.println("=".repeat(80));

        System.out.println("\n1️⃣  UPPER BOUND (? extends Type)");
        System.out.println("   • Accepts Type and all subclasses");
        System.out.println("   • Use for READING data");
        System.out.println("   • Cannot ADD (except null)");
        System.out.println("   • Example: List<? extends Animal> animals");

        System.out.println("\n2️⃣  LOWER BOUND (? super Type)");
        System.out.println("   • Accepts Type and all superclasses");
        System.out.println("   • Use for WRITING data");
        System.out.println("   • Can ADD items freely");
        System.out.println("   • Example: List<? super Dog> dogs");

        System.out.println("\n3️⃣  UNBOUNDED (<?>) - No restrictions");
        System.out.println("   • Accepts anything");
        System.out.println("   • Can only use Object methods");
        System.out.println("   • Example: List<?> list");

        System.out.println("\n4️⃣  NO WILDCARD (<Type>)");
        System.out.println("   • Exactly that type only");
        System.out.println("   • Can READ and WRITE freely");
        System.out.println("   • Example: List<Integer> list");

        System.out.println("\n" + "=".repeat(80) + "\n");
    }
}
