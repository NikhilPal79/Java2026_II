package Java_Topics.EqualAndHashcode;

public class StuMain {
    static void main(String[] args) {


        Stu stu1 = new Stu(12,"mayank");
        Stu stu2 = new Stu(12,"nikhil");

        System.out.println(stu1.equals(stu2));

        System.out.println(stu1.hashCode() == stu2.hashCode());
    }
}
