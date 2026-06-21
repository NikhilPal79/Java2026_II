package Assignment4.LibraryBookSys;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {




        Book[] arrays = new Book[4];
        arrays[0] = new PhysicalBook(1001, "Math", "HC VERMA", 700.0);
        arrays[1] = new PhysicalBook(1005, "PHYSICS", "HV POTTER", 200.0);
        arrays[2] = new EBook(1008, "CHEMISTRY", "TV TRIPATI", 300.0);
        arrays[3] = new EBook(1003, "BIO", "PC KATH", 800.0);

        System.out.println("***********LOOP OVER EACH BOOK*****************");
        for (Book e : arrays) {
            System.out.println(e);
        }
        System.out.println("*********RUN TIME POLYMORPHISM ****************");
        Returnable returnable;
        returnable = new PhysicalBook(1001, "Math", "HC VERMA", 700.0);
        returnable.returnBook("Nikhil");
        System.out.println();

        Book book ;
        book = new EBook(1003, "BIO", "PC KATH", 800.0);
        book.borrowBook("Manpreet");
        System.out.println();
        book = new PhysicalBook(1001, "PHYSICS", "HV POTTER", 200.0);
        book.borrowBook("Mayank");


        System.out.println("*****************************************");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] instanceof PhysicalBook) {
                PhysicalBook pb = (PhysicalBook) arrays[i];
                pb.returnBook("Nikhil");
            }


        }







    }
}
