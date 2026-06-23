package Assignment4.CompanyPayrollSys3;

public abstract class Employee{

    private final int empId;
    private final String firstName;
    private final String department;


    public Employee(int empId, String firstName, String department) {
        this.empId = empId;
        this.firstName = firstName;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDepartment() {
        return department;
    }

    abstract double calculatePay();

    public void printPaySlip(){
        System.out.println("***** Print Slip *****");
        System.out.println("Employee ID : " + empId);
        System.out.println("First Name : " + firstName);
        System.out.println("Department : " + department);
        System.out.println("Gross Pay : " + calculatePay());
    }

    public void employeeInfo(){
        System.out.println("Employee ID : "+empId);
        System.out.println("First Name : "+firstName);
        System.out.println("Department : "+department);
    }
}
