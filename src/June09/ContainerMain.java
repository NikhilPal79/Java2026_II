package June09;

public class ContainerMain {
    static void main(String[] args) {


        Container<String,Integer> stu1 = new Container<>("Harry",1,"Management");
        Container<String,Integer> stu2 = new Container<>("Ron",2,"History");
        Container<String,Integer> stu3 = new Container<>("Tom",3,"Economics");
        Container<String,Integer> stu4 = new Container<>("Jerry",4,"Maths");


        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4);
    }
}
