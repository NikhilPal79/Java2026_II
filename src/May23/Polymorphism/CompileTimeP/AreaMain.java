package May23.Polymorphism.CompileTimeP;

public class AreaMain {
    static void main(String[] args) {

        Area a = new Area();
        System.out.println("area of square : " + a.square(10));

        System.out.println("area of rectangle : " + a.rectangle(10,20));
    }
}
