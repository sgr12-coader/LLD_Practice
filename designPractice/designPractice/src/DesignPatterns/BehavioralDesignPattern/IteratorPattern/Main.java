package DesignPatterns.BehavioralDesignPattern.IteratorPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(
            new Book("Book1", "Author1", 100),
            new Book("Book2", "Author2", 200),
            new Book("Book3", "Author3", 300)
        );
        Library library = new Library(books);
        Iterator iterator = library.getIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Book: " + book.getName() + ", Author: " + book.getAuthor() + ", Price: " + book.getPrice());
        }
    }
}
