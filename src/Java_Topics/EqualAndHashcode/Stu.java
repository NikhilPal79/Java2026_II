package Java_Topics.EqualAndHashcode;

import java.util.Objects;

public class Stu {
    int  id;
    String name;

    public Stu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stu stu = (Stu) o;
        return id == stu.id && Objects.equals(name, stu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
