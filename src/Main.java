import app.Bookstore;

public class Main {
    public static void main(String[] args) {
        Bookstore mondadori = new Bookstore("Mondadori");

        mondadori.addShelf("Fantasy");
        mondadori.addShelf("Horror");

        mondadori.addBook("Lord of The Rings", 24.90, "Fantasy");
        mondadori.addBook("Harry Potter", 14.90, "Fantasy");
        mondadori.addBook("The Phantom", 11.90, "Horror");

        System.out.println(mondadori.getShelfFromCategory("Horror"));
    }
}
