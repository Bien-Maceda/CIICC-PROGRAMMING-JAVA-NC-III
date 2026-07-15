package chapter1;
import java.util.Date;

public class NamingConflictLesson {
    Date d1;
    java.sql.Date d2;
    // OtherFolder.SunFlower s1;
    // OtherFolder.A.Makahiya m1;

    public static void main(String[] args) {
        NamingConflictLesson lesson = new NamingConflictLesson();
        lesson.d1 = new Date();
        lesson.d2 = new java.sql.Date(System.currentTimeMillis());

        System.out.println("java.util.Date: " + lesson.d1);
        System.out.println("java.sql.Date: " + lesson.d2);
    }
}