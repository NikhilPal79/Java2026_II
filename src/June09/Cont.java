package June09;

public class Cont {

    String name;
    int rollNo;
    String courseName;

    public Cont(String name, int rollNo, String courseName) {
        this.name = name;
        this.rollNo = rollNo;
        this.courseName = courseName;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
