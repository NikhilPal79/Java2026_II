package Assignment4.LibraryBookSys;

public class PhysicalBook extends Book implements Returnable {


    String shelfLocation = "upper";
    int availableCopy = 5;

    public PhysicalBook(int bookId, String title, String author, double price) {
        super(bookId, title, author, price);
    }

    @Override
    void borrowBook(String borrowerName) {
        System.out.println(borrowerName + " Borrowing Physical Book " + "AvailableCopy : " + ( availableCopy -1 )  );
    }

    @Override
    public void returnBook(String borrowerName) {
        System.out.println(borrowerName + " Returning Physical Book " + "AvailableCopy : " + (availableCopy + 1 ) );
    }
}
