package May23.Composition;

public class Car {

    Engine engine = new Engine();

    public void start(){
        engine.dieselEngine();
        System.out.println("car is starting ");
    }
}
