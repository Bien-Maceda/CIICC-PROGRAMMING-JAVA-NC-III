package TASKS;

import static java.lang.Math.*;

public class Task9 {
     public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {
        int x = 20, y = 6;

        System.out.println("a = " + x + ", b = " + y);
        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division (floorDiv): " + divide(x, y));

        int p = -7, q = 2;
        System.out.println();
        System.out.println("a = " + p + ", b = " + q);
        System.out.println("Addition: " + add(p, q));
        System.out.println("Subtraction: " + subtract(p, q));
        System.out.println("Multiplication: " + multiply(p, q));
        System.out.println("Division (floorDiv): " + divide(p, q));
    }
}
