package Assignment4.LibraryBookSys;

public class Main {
    static void main(String[] args) {




        Book[] arrays = new Book[4];
        arrays[0] = new PhysicalBook(1001, "Math", "HC VERMA", 700.0,"7th self",15);
        arrays[1] = new PhysicalBook(1005, "PHYSICS", "HV POTTER", 200.0,"8th self",12);
        arrays[2] = new EBook(1008, "CHEMISTRY", "TV TRIPATI", 300.0, 15.2);
        arrays[3] = new EBook(1003, "BIO", "PC KATH", 800.0,10.5);

        System.out.println("***********LOOP AND CALL BorrowBook() ON each *****************");
        System.out.println("***************************************************************");


        for (Book e : arrays) {
            if (e != null) {
                System.out.println(e.getTitle() + " (" + e.getClass().getSimpleName() + ")");
            }
            try {
                e.borrowBook("nikhil");
            } catch (BookNotAvailableException ex) {
                System.out.println("Book Not Available");
            }
        }

        System.out.println("***********             Return Type           *****************");
        System.out.println("***************************************************************");


        for (Book e : arrays) {
            if (e != null) {
                if (e instanceof PhysicalBook) {
                    System.out.println("Returning : " + e.getTitle());
                    ((Returnable) e).returnBook("nikhil");
                }else {
                    System.out.println( e.getTitle() + " is an E-Book, No need to return");
                }
            }
        }


    }








}
