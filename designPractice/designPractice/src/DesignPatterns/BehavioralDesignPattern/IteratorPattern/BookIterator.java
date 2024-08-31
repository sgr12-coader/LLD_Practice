package DesignPatterns.BehavioralDesignPattern.IteratorPattern;

import java.util.List;

public class BookIterator implements Iterator{
    private List<Book> books;
    private int position;

    BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Object next() {
        return books.get(position++);
    }
}
