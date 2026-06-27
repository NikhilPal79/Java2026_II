package June27;

public class Student {

    String studentName;
    String course;

    public Student(String studentName, String course) {
        this.studentName = studentName;
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
