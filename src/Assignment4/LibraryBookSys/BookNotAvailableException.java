package Assignment4.LibraryBookSys;

public class BookNotAvailableException extends Exception {


    public BookNotAvailableException(String message) {
        super(message);
    }


    public  BookNotAvailableException(int bookId, String title) {
        super("Book '" + title + "' (ID: " + bookId + ") is currently not available. No copies left.");
    }

}
