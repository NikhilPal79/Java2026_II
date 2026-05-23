package May23.Polymorphism.CompileTimeP;

public class CalMain {
    static void main(String[] args) {

        Calculator  calc = new Calculator();
        System.out.println(calc.sum(4, 2));

        System.out.println(calc.sub(1, 5, 9));
    }
}
