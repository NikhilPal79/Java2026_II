package June25;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmpMain {
    static void main(String[] args) {


        System.out.println("HASH SET");
        Set<Employee> employees = new HashSet<>();
        employees.add( new Employee("Harry",28, "IT", 60000.0));
        employees.add( new Employee("Harry",28, "IT", 60000.0));
        employees.add( new Employee("Ron",30, "HR", 70000.0));
        employees.add( new Employee("Emma",32, "FINANCE", 80000.0));

        System.out.println(employees);
        System.out.println();

        for(Employee e: employees){
            System.out.println(e);
        }

        System.out.println();

        System.out.println("TREE SET");

        Set<Employee> emp = new TreeSet<>();
        emp.add( new Employee("Harry",28, "IT", 60000.0));
        emp.add( new Employee("Harry",28, "IT", 60000.0));
        emp.add( new Employee("Ron",30, "HR", 70000.0));
        emp.add( new Employee("Emma",32, "FINANCE", 80000.0));

        System.out.println(emp);
        System.out.println();

        for(Employee e: emp){
            System.out.println(e);
        }
    }



}
