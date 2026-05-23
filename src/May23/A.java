package May23;

import java.sql.SQLOutput;

public class A {


    A(){
        System.out.println("class a called ");
    }
    A(int x){
        System.out.println(x);
    }
    void show(){
        System.out.println(" a method");
    }

}
class B extends A{
    B(){
        super();
        System.out.println("class b called ");
    }
    B(int y){
        this();
        System.out.println(y);
    }
    void show1(){
        System.out.println(" b method");
    }

}

class AMain {
    public static void main(String[] args) {
        B b = new B(10);
    }
}
