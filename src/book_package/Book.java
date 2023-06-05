package book_package;

public class Book {
    private int ISBN;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book(int ISBN, String title, String author, double price, int quantity) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    
}
