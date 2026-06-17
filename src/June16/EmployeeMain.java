package June16;

import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.list;

public class EmployeeMain {
    static void main(String[] args) {

        List<Employee> list = new LinkedList<>();
        list.add(new Employee(1,"TOM",50000));
        list.add(new Employee(4,"Jerry",60000));
        list.add(new Employee(3,"Bob",70000));
        list.add(new Employee(7,"Perry",80000));

        int maxSalary= 0;
        String employee = null;

        for (Employee e : list) {
            if(maxSalary < e.getSalary()){
                maxSalary = (int) e.getSalary();
                employee = e.getName();
            }
        }
        System.out.println(employee + " has the highest salary " + maxSalary);
    }
}
