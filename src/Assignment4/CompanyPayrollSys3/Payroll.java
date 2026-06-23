package Assignment4.CompanyPayrollSys3;

public class Payroll{

    private Employee[] employees ;
    public int count=0;

    public Payroll(int capacity){
        employees = new Employee[capacity];
    }

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        } else {
            System.out.println("Payroll is full — cannot add " + e.getFirstName());
        }
    }

    /// add to payroll
    public void processAll(){
        for(int i=0;i<count;i++){
            employees[i].printPaySlip();

            if(employees[i] instanceof Taxable){
                Taxable taxable = (Taxable) employees[i];
                System.out.println("Tax Info");
                System.out.println("Slab : " + taxable.getTaxSlab() );
                System.out.println("Tax Amount : " + taxable.calculateTax());
                System.out.println("Net Pay : " + (employees[i].calculatePay() -taxable.calculateTax()));
            }else {
                System.out.println(" Tax exempt ");
            }
            System.out.println();
        }

    }

}
