package June09;

public class Container<A,B>{

    A Student ;
    B CourseName;


    public Container(A student, B courseName) {
        Student = student;
        CourseName = courseName;
    }

    @Override
    public String toString() {
        return "Container{" +
                "Student=" + Student +
                ", CourseName=" + CourseName +
                '}';
    }
}
