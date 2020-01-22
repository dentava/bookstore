package app;

import java.util.ArrayList;

class Shelf {

    private String name;
    private ArrayList<Book> books;

    Shelf(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book){
        books.add(book);
    }

    void removeBook(Book book){
        books.remove(book);
    }

    String getName() {
        return name;
    }

    ArrayList<Book> getBooks(){
        return books;
    }

    Book getBookFromTitle(String title){
        for (Book book : books){
            if (book.getTitle().equals(title)) return book;
        }
        return null;
    }
}
