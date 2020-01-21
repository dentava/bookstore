package app;

class Book {

    private String title;
    private float price;
    private String category;

    Book(String title, float price, String category){
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

    private String getTitle() {
        return title;
    }

    private float getPrice() {
        return price;
    }

    private String getCategory() {
        return category;
    }
}
