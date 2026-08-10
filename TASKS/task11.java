package TASKS;

public class task11 {
    public static void main(String[] args) {
        book book1 = new book("Java Programming", "John Smith", 2021, 39.99);
        book book2 = new book("Python Basics", "Jane Doe", 2020, 29.99);
        book book3 = new book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println();

        System.out.println("Book 2:");
        System.out.println(book2);
        System.out.println();

        System.out.println("Book 3:");
        System.out.println(book3);
    }
}
