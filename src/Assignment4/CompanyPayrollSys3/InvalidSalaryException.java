package Assignment4.CompanyPayrollSys3;

public class InvalidSalaryException extends Exception {

    public InvalidSalaryException(String message) {
        super(message);
    }

    /// for invalid salary/stipend/hourlyRate
    public InvalidSalaryException(double salary) {
        super("Invalid salary: " + salary);
    }

    public InvalidSalaryException(int hourlyRate) {
        super("Invalid hourlyRate: " + hourlyRate);
    }


}
