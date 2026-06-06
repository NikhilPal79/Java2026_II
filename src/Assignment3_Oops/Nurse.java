package Assignment3_Oops;


public class Nurse extends Staff {

    private String ward;

    public Nurse(String staffId, String name, int age, String ward) {
        super(staffId, name, age);
        this.ward = ward;
    }


    public void describeDuty(){
        System.out.println(getName() + " - Ward : " + ward + " - Assists doctors and cares for patients");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }


}
