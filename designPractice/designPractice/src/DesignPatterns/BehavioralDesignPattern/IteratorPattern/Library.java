package DesignPatterns.BehavioralDesignPattern.IteratorPattern;

import java.util.List;

public class Library {
    private List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    public Iterator getIterator() {
        return new BookIterator(books);
    }
}
