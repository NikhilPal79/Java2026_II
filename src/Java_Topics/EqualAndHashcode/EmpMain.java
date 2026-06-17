package Java_Topics.EqualAndHashcode;

public class EmpMain {
    static void main(String[] args) {

        Emp emp1 = new Emp(5072,"nikhil");
        Emp emp2 = new Emp(5072,"nikhil");
        System.out.println(emp1.equals(emp2));

        System.out.println(emp1.hashCode() == emp2.hashCode());


    }
}
