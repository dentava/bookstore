package app;

import java.util.List;

class Shelf {

    private String name;
    private List<Book> books;

    Shelf(String name){
        this.name = name;
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

    Book getBookFromTitle(String titile){
        //TODO
        return book;
    }
}
