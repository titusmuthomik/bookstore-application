import book_package.Book;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void  main(String[] args){
        System.out.println("Hello and welcome to my application");
        Book bookOne = new Book(123, "Java", "James Gosling", 120, 12);
        Book bookTwo = new Book(123, "Javascript", "James Gosling", 130, 130);
        Book bookThree = new Book(123, "Php", "James Gosling", 140, 102);
        Book bookFour = new Book(123, "Python", "James Gosling", 90, 310);

        List<Book> books = new ArrayList<>();

        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.add(bookFour);


        books.forEach(System.out::println);
    }
}
