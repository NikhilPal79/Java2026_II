package Assignment2.ReportGenerator;

public class Main {
    static void main(String[] args) {


        ReportService reportService;
        reportService = new ReportService();


        ReportGenerator reportGenerator;
        reportGenerator = new PdfReport();
        reportGenerator.generateReport();
        reportService.generate(reportGenerator);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");


        reportGenerator = new ExcelReport();
        reportGenerator.generateReport();
        reportService.generate(reportGenerator);
    }
}
