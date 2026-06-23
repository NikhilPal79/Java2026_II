package Assignment4.LibraryBookSys;

public class PhysicalBook extends Book implements Returnable {


    String shelfLocation;
    int availableCopy;

    public PhysicalBook(int bookId, String title, String author, double price, String shelfLocation, int availableCopy) {
        super(bookId, title, author, price);
        this.shelfLocation = shelfLocation;

        if (availableCopy < 0 ) {
            throw new IllegalArgumentException("Available copies can not be negative :  " + availableCopy);
        }
        this.availableCopy = availableCopy;
    }



    @Override
    void borrowBook(String borrowerName) throws BookNotAvailableException {
        if (availableCopy == 0) {
            throw new BookNotAvailableException(getBookId() , getTitle());
        }

        availableCopy--;
        System.out.println("Book Borrowed Successfully " );
        System.out.println("Shelf Location: " + shelfLocation );
        System.out.println("Remaining Copies: " + availableCopy );

    }

    @Override
    public void returnBook(String borrowerName) {
        availableCopy++;
        System.out.println("Book Return Successfully " );
        System.out.println("Shelf Location: " + shelfLocation );
        System.out.println("Available Copies: " + availableCopy );
    }
}
