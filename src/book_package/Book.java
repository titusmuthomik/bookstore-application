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

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book -> {" +
                " ISBN = " + ISBN +
                ", title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", price = " + price +
                ", quantity = " + quantity +
                '}';
    }
}
