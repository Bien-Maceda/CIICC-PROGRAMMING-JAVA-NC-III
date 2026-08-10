package TASKS;

public class Books {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Books(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + String.format("%.2f", price);
    }
}
