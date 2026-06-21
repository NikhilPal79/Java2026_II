package Assignment4.LibraryBookSys;

public class EBook extends Book {
    double fileSize;
    boolean available;

    public EBook(int bookId, String title, String author, double price) {
        super(bookId, title, author, price);
    }


    @Override
    void borrowBook(String borrowerName) {
        System.out.println("Download Confirmation FROM " + borrowerName + " Copies never run out ");
    }
}
