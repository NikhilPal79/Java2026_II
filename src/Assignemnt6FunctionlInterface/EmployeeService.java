package Assignemnt6FunctionlInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class EmployeeService {

    // Task 1 — accepts a Predicate to test each employee
    public List<Employee> filterEmployees(List<Employee> employees,
                                          Predicate<Employee> condition) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (condition.test(e)) {    // ← invoking YOUR lambda here
                result.add(e);
            }
        }
        return result;
    }

    // Task 2 — accepts a Consumer to do something with each employee
    public void processEach(List<Employee> employees,
                            Consumer<Employee> action) {
        for (Employee e : employees) {
            action.accept(e);            // ← invoking YOUR lambda here
        }
    }

    // Task 3 — accepts a Function to convert Employee → String
    public String transform(Employee employee,
                            Function<Employee, String> mapper) {
        return mapper.apply(employee);  // ← invoking YOUR lambda here
    }

    // Task 4 — accepts a Supplier to produce an Employee
    public Employee createDefault(Supplier<Employee> factory) {
        return factory.get();           // ← invoking YOUR lambda here
    }

    // Task 5 — accepts a BiFunction: (Employee, Double) → Double
    public double calculateBonus(Employee employee, double percent,
                                 BiFunction<Employee, Double, Double> formula) {
        return formula.apply(employee, percent); // ← invoking YOUR lambda here
    }

    // Task 6 — accepts a BiPredicate: (Employee, Double) → boolean
    public boolean isInRange(Employee employee, double maxSalary,
                             BiPredicate<Employee, Double> rangeCheck) {
        return rangeCheck.test(employee, maxSalary); // ← invoking YOUR lambda here
    }


}
