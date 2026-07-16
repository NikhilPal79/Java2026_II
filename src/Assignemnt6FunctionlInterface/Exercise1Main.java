package Assignemnt6FunctionlInterface;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Main {
    static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        List<Employee> employees = List.of(
                new Employee("Alice Johnson", "SENIOR_DEV",  "ENGINEERING", 85000),
                new Employee("Bob Martin",   "HR_MANAGER",  "HR",          60000),
                new Employee("David Lee",    "LEAD_DEV",    "ENGINEERING", 95000),
                new Employee("Sarah Kim",    "PM",          "PRODUCT",     75000),
                new Employee("Emma Davis",   "RECRUITER",   "HR",          52000)
        );
        // ─── TASK 1: Filter employees earning > 70,000 ───────────────────
        System.out.println("--- Task 1: High Earners ---");
        List<Employee> highEarners = service.filterEmployees(employees, employee -> employee.getSalary() > 70000);
        highEarners.forEach(System.out::println);

        // ─── TASK 2: Print each as "[DEPT] Name - Role" ──────────────────
        System.out.println("\n--- Task 2: Print All Employees ---");
        service.processEach(employees, employee -> employee.getDepartment().concat(employee.getRole()));

        // ─── TASK 3: Transform Alice into a summary String ───────────────
        System.out.println("\n--- Task 3: Summary of Alice ---");
        Employee alice = employees.get(0);
        String summary = service.transform(alice)
        );
        System.out.println(summary);


    }
}
