package May26;

public class A {

     static void show(){
        System.out.println("class A");
    }

}

class B extends A{
    static void show(){
        System.out.println("class B");
    }


    public static void main(String[] args) {

        A a = new B();
        a.show();
    }

}