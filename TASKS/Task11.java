package TASKS;

public class Task11 {
    public static void main(String[] args) {
        Books book1 = new Books("Java Programming", "John Smith", 2021, 39.99);
        Books book2 = new Books("Python Basics", "Jane Doe", 2020, 29.99);
        Books book3 = new Books("C++ Essentials", "Michael Johnson", 2019, 49.99);

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
