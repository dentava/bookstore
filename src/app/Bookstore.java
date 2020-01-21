package app;

import java.util.List;

public class Bookstore {

    private List<Shelf> shelfs;
    private String name;

    public Bookstore(String name){
        this.name = name;
    }

    private void addShelf(Shelf shelf){
        shelfs.add(shelf);
    }

    private void removeShelf(Shelf shelf){
        shelfs.remove(shelf);
    }

    private String getName() {
        return name;
    }

    private List<Book> getShelfFromCategory(String category){
        for (Shelf shelf : shelfs){
            if (shelf.getName().equals(category)) return shelf.getBooks();
        }
        return new List<Book>;
    }
}
