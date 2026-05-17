package May09.Static;

public class Demo {


    int x = 10;

    public Demo(){
        System.out.println(x);
        x++;

    }


    static void main(String[] args) {


        Demo demo = new Demo();
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();

        System.out.println(demo.x);
        System.out.println(demo1.x);
        System.out.println(demo2.x);


    }
}
