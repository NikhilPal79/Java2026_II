package Assignment4.CompanyPayrollSys3;

public class Intern extends Employee {

    private  double stipend;

    public Intern(int empId, String firstName, String department, double stipend) throws InvalidSalaryException {
        super(empId, firstName, department);
        if (stipend <= 0) {
            throw new InvalidSalaryException("Stipend cannot be negative");
        }
        this.stipend = stipend;
    }



    @Override
    double calculatePay() {
        return stipend;
    }
}
