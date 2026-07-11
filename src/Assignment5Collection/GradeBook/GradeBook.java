package Assignment5Collection.GradeBook;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    int grade;

    HashMap<String, Integer> students = new HashMap<>();

    void addGrade(String studentName, int grade) {
        students.put(studentName, grade);
        System.out.println("Grade set : name " + studentName + " grade " + grade);
    }

    void getGrade(String studentName) {
        if (students.containsKey(studentName)) {
            System.out.println("Grade : " + students.get(studentName) );
        }else {
            System.out.println("Student name not found : name = " + studentName);
        }
    }

    void topStudents(int threshold) {
        System.out.println("Top students : Greater than " + threshold);
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() >= threshold) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    void classAverage(){
        if (students.isEmpty()) {
            System.out.println("No student");
            return;
        }
        double sum = 0;

        for (int e : students.values()) {
            sum = sum + e;
        }
        System.out.println("Average : " + sum / students.size());

    }

    void remove(String studentName) {
        students.remove(studentName);
        System.out.println("Removed student : " + studentName);
    }
}
