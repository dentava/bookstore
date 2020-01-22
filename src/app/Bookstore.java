package app;

import java.util.ArrayList;

public class Bookstore {

    private ArrayList<Shelf> shelfs;
    private String name;

    public Bookstore(String name){
        this.name = name;
        shelfs = new ArrayList<>();
    }

    public void addShelf(String title){
        Shelf newShelf = new Shelf(title);
        shelfs.add(newShelf);
    }

    public void addBook(String title, double price, String category){
        for (Shelf shelf : shelfs){
            if (shelf.getName().equals(category)){
                Book book = new Book(title, price, category);
                shelf.addBook(book);
            }
        }
    }

    public void removeShelf(Shelf shelf){
        shelfs.remove(shelf);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getShelfFromCategory(String category){
        for (Shelf shelf : shelfs){
            if (shelf.getName().equals(category)) return shelf.getBooks();
        }
        return null;
    }
}
