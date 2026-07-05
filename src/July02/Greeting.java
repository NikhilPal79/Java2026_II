package July02;
@FunctionalInterface
public interface Greeting {

    default void  greet( String name){
        System.out.println(name + "printing 1st default method ");
    };

    default void  meet( String name){
        System.out.println(name + "printing 2st default method ");
    }

    /// Only one abstract method
    String getGreet(String name);

    static void doSomething(){
        System.out.println("doSomething" + " printing 1st static method ");
    }

    static void getSomething(){
        System.out.println("getSomething" + " printing 2st static method ");
    }





}
