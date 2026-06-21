package Assignment3;

public class HmsMain {
    static void main(String[] args) {


        Staff [] arr = new Staff[3];
        arr[0] = new Doctor("D001","Dr.Sharma",45,"Cardiology",800);
        arr[1] = new Nurse("N001","Nurse Priya",30,"ICU Ward");
        arr[2] = new Doctor("D002","Dr John",50,"Dermatology",500);

        for(int i = 0; i < arr.length; i++){
            arr[i].displayInfo();
            arr[i].describeDuty();
        }

        double totalBilling = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] instanceof Billable){
                Billable billable = (Billable) arr[i];
                double fee = billable.generateBill();
                String billDescription = billable.getBillDescription();
                totalBilling = totalBilling + fee;

                System.out.println("Bill for " + arr[i].getName() + " — Consultation Fee: " + fee);
            }
        }
        System.out.println("Total Hospital Revenue : " + totalBilling );
        System.out.println();



        Doctor doctor = new Doctor("D003","Dr.Sharma",45,"Cardiology",800);
        doctor.displayInfo();
        doctor.prescribe("medicine1");
        doctor.prescribe("medicine2",7);
    }
}
