package book_package;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> books= new ArrayList<>();
    private User user;

    private double totalPrice = 0;

    public ShoppingCart(List<Book> books, User user) {
        this.books = books;
        this.user = user;

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotalPrice() {
        for(Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCart -> {" +
                "books =" + books +
                ", user =" + user +
                ", totalPrice =" + totalPrice +
                '}';
    }
}
