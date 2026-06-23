package Assignment4.CompanyPayrollSys3;

public class Contractor extends Employee implements Taxable{


    private final int hourlyRate;
    private final int hoursWorked;


    public Contractor(int empId, String firstName, String department, int hourlyRate, int hoursWorked) throws InvalidSalaryException {
        super(empId, firstName, department);

        if (hourlyRate < 0 ) {
            throw new InvalidSalaryException("HourlyRate cannot be negative");
        }
        this.hourlyRate = hourlyRate;
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("HoursWorked cannot be negative");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked ;
    }

    @Override
    public double calculateTax() {
        return calculatePay() * 0.15;
    }

    @Override
    public String getTaxSlab() {
        return " 15% - Contractor Flat Rate ";
    }
}
