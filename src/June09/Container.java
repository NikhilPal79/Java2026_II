package June09;

public class Container{

    Student item1;
    Course item2;


    public Container(Student item1, Course item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public Student getItem1() {
        return item1;
    }

    public Course getItem2() {
        return item2;
    }

    @Override
    public String toString() {
        return "Container{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }
}
