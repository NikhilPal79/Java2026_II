package May09.Static;

public class Test {

    static int x = 10;
    public Test(){
        System.out.println(x);
        x++;

    }

    static void main(String[] args) {


        Test t = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        System.out.println();

        System.out.println(Test.x);

    }
}
