package Assignment5Collection.GradeBook;

public class Main {
    static void main(String[] args) {

        GradeBook gradeBook = new GradeBook();
        gradeBook.addGrade("Ron", 50);
        gradeBook.addGrade("Tom", 60);
        gradeBook.addGrade("Son", 70);
        gradeBook.addGrade("Von", 80);
        gradeBook.addGrade("Jer", 90);
        System.out.println();
        gradeBook.getGrade("Jer");
        System.out.println();
        gradeBook.topStudents(70);
        System.out.println();
        gradeBook.classAverage();
        System.out.println();
        gradeBook.remove("Von");
        System.out.println();
    }
}
