package Assignment4.CompanyPayrollSys3;

public class Main {
    static void main(String[] args) throws InvalidSalaryException {

        Payroll payroll = new Payroll(6);

        try {
            Employee employee1 = new FullTimeEmployee(1,"Nick","ENGINEER",55000.0,8000.0);
            Employee employee2 = new FullTimeEmployee(2,"Jerry","CA",65000.0,5000.0);
            Employee contractor1 = new Contractor(4,"Harry","TECHNICIAN",35,60);
            Employee contractor2 = new Contractor(3,"Potter","FINANCE",40,40);
            Employee intern1 = new Intern(5,"Snape","HR",10000.0);
            Employee intern2 = new Intern(6,"Dumbledore","DEVELOPER",10000.0);

            payroll.addEmployee(employee1);
            payroll.addEmployee(employee2);
            payroll.addEmployee(contractor1);
            payroll.addEmployee(contractor2);
            payroll.addEmployee(intern1);
            payroll.addEmployee(intern2);


            /// printPaySlip Demo
            employee1.printPaySlip();
            System.out.println();

            /// Process entire payroll
            payroll.processAll();



        }catch (InvalidSalaryException e){
            System.out.println("INVALID SALARY EXCEPTION " + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("INVALID ARGUMENT EXCEPTION "+ e.getMessage());
        }finally {
            System.out.println("Payroll processing complete");
        }

    }
}
