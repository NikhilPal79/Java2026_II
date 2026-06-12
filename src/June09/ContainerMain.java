package June09;

import java.util.ArrayList;

public class ContainerMain {
    static void main(String[] args) {

        Container<Student,Course > stu = new Container<>(new Student("nikhil",5072), new  Course("Java Programming"));
        Container<Student,Course > stu1 = new Container<>(new Student("tom",5044), new  Course("Advance Java Programming"));

        System.out.println(stu);
        System.out.println(stu1);
    }
}
