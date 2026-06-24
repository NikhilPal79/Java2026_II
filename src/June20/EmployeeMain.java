package June20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeMain {
    static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom",28,"Finance",60000.0));
        employees.add(new Employee("John",38,"Developer",40000.0));
        employees.add(new Employee("Harry",29,"Developer",70000.0));
        employees.add(new Employee("Kane",30,"Tech",65000.0));

        System.out.println(employees);
        System.out.println();
        System.out.println("Average Salary in Developer Dept");

        double avgSalary = employees.get(0).getSalary();
        /*for (int i = 0; i < ; i++) {

        }*/

        System.out.println();
        System.out.println(" remove less than 50k salary");

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee nexted = iterator.next();
            if(nexted.getSalary() <= 50000.0){
                iterator.remove();
            }

        }
        System.out.println(employees);

        System.out.println();
        System.out.println("Highest Salary ");

        double highestSalary = employees.get(0).getSalary();
        for (int i = 0; i < employees.size() ; i++) {
            if(employees.get(i).getSalary() > highestSalary){
                highestSalary = employees.get(i).getSalary();
            }

        }
        System.out.println(highestSalary);



    }
}

