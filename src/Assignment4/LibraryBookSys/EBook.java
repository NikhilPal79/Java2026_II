package Assignment4.LibraryBookSys;

public class EBook extends Book {
    double fileSize;


    public EBook(int bookId, String title, String author, double price,double fileSize) {
        super(bookId, title, author, price);

        if (fileSize < 0) {
            throw new IllegalArgumentException("File size cannot be negative : " + fileSize + " mb ");
        }
        this.fileSize = fileSize;
    }


    @Override
    void borrowBook(String borrowerName) throws BookNotAvailableException {
        System.out.println("E-Book borrowed successfully!");
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Downloading... 100% complete");
    }
}
