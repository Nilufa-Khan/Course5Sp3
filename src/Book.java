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




}
