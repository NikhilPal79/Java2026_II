package Assignment3;

public abstract class Staff {

    private String staffId;
    private String name;
    private int age;

    public Staff(String staffId, String name, int age) {
        this.staffId = staffId;
        this.name = name;
        this.age = age;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract void describeDuty();
}
