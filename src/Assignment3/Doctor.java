package Assignment3;

public class Doctor  extends Staff implements Billable{
    private  String specialization;
    private  double consultationFee;

    public Doctor(String staffId, String name, int age, String specialization, double consultationFee) {
        super(staffId, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }


    @Override
    public double generateBill() {
        return consultationFee;
    }

    @Override
    public String getBillDescription() {
        return "Consultation Fee: " + consultationFee + " for " + specialization;
    }


    public void describeDuty(){
        System.out.println(getName() + " - Specialization : " + specialization + " - Diagnoses and treats patients ");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public void prescribe(String medicine){;
        System.out.println("Prescribing : " + medicine);
    }
    public void prescribe(String medicine, int days){
        System.out.println("Prescribing : " + medicine + " for " + days + " days");
    }

}
