package May30.Interface.P1;

public class SmartPrinter implements Fax, Scanner,Printer {
    @Override
    public void scans() {
        System.out.println("SmartPrinter scans...");
    }

    @Override
    public void faxs() {
        System.out.println("SmartPrinter fax...");
    }

    @Override
    public void prints() {
        System.out.println("SmartPrinter prints...");
    }
}
