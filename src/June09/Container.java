package June09;

public class Container <K,L>{

    K studentName;
    L studentRollNo;
    K courseName;

    public Container(K studentName, L studentRollNo, K courseName) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.courseName = courseName;
    }

    public K getStudentName() {
        return studentName;
    }

    public L getStudentRollNo() {
        return studentRollNo;
    }

    public K getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Container{" +
                "studentName=" + studentName +
                ", studentRollNo=" + studentRollNo +
                ", courseName=" + courseName +
                '}';
    }
}
