package Assignment4.LibraryBookSys1;

public abstract class Book {

    private final int bookId;
    private final String title;
    private final String author;
    private final double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative : " + price);
        }
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    abstract void borrowBook(String borrowerName) throws BookNotAvailableException;


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
