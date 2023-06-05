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

    public int getISBN() {
        return ISBN;
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

    public int getQuantity() {
        return quantity;
    }
}
