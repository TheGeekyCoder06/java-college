class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        displayBookInfo("Default Constructor");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
        displayBookInfo("Two-Argument Constructor");
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        displayBookInfo("Three-Argument Constructor");
    }

    public void displayBookInfo(String constructorType) {
        System.out.println("--- Book Initialized via " + constructorType + " ---");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + String.format("%.2f", this.price));
        System.out.println("----------------------------------------\n");
    }
}

public class test{
    public static void main(String[] args) {
        Book b1 = new Book();
        // b1.displayBookInfo("Default constructor");
        Book b2 = new Book("Rich dad Poor Dad" , "Robert Kiyosaki");
        // b2.displayBookInfo("Two argument constructor");
    }
}