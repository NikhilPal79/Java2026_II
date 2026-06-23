package Assignment4.CompanyPayrollSys3;

public class FullTimeEmployee extends Employee implements Taxable{


    private final double salary;
    private final double bonus;


    public FullTimeEmployee(int empId, String firstName, String department, double salary, double bonus) throws InvalidSalaryException {
        super(empId, firstName, department);
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        this.salary = salary;
        if (bonus < 0) {
            throw new InvalidSalaryException("Bonus cannot be negative");
        }
        this.bonus = bonus;

    }


    @Override
    double calculatePay() {
        return salary + bonus;
    }

    @Override
    public double calculateTax() {
        return calculatePay() < 50000.0 ? calculatePay() * 0.10 : calculatePay() * 0.20;
    }

    @Override
    public String getTaxSlab() {
        return calculatePay() < 50000.0 ? " 10% - Standard Slab " : " 20% - High Income Slab " ;
    }
}
