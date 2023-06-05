import book_package.Book;
import book_package.User;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void  main(String[] args){
        System.out.println("Hello and welcome to my application");
        Book bookOne = new Book(123, "Java", "James Gosling", 120, 12);
        Book bookTwo = new Book(123, "Javascript", "James Gosling", 130, 130);
        Book bookThree = new Book(123, "Php", "James Gosling", 140, 102);
        Book bookFour = new Book(123, "Python", "James Gosling", 90, 310);

        User userOne = new User("titus", "kalunge@mail.com", "qwerty", "Kikuyu", "0713398918", "admin");

        List<Book> books = new ArrayList<>();
        List<User> users = new  ArrayList<>();

        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.add(bookFour);

        users.add(userOne);


        books.forEach(System.out::println);
        users.forEach(System.out::println);
    }
}
