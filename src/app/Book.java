package app;

class Book {

    private String title;
    private double price;
    private String category;

    Book(String title, double price, String category){
        this.title = title;
        this.price = price;
        this.category = category;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setPrice(float price) {
        this.price = price;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    String getTitle() {
        return title;
    }

    double getPrice() {
        return price;
    }

    String getCategory() {
        return category;
    }
}
