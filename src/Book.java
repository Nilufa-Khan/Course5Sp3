public class Book implements Comparable<Book>{

    private String bookName;
    private String author;
    private double price;
    private long isbn;
    public Book() {
    }
    public Book(String bookName, String author, double price, long isbn) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", isbn=" + isbn +
                '}';
    }
    @Override
    public int compareTo(Book obj) {

        if (this.price == obj.price) {
            return 0;
        }
        if (this.price < obj.price) {
            return -1;

        }

        return 1;
    }







}
