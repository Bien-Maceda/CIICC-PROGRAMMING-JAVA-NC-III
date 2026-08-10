package TASKS;

import java.util.Scanner;

public class Task8 {
    // Variable-arguments method:
    // For each parameter n, computes the cumulative (triangular) sum 1+2+...+n,
    // prints it, and returns the grand total of all those cumulative sums.
    public static int sumWithCumulative(int... numbers) {
        int grandTotal = 0;

        for (int n : numbers) {
            int cumulative = 0;
            StringBuilder expression = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                cumulative += i;
                expression.append(i);
                if (i < n) expression.append("+");
            }

            System.out.println(n + " = (" + expression + ") = " + cumulative);
            grandTotal += cumulative;
        }

        return grandTotal;
    }

    public static void main(String[] args) {
        // Example from the assignment: (4, 5, 10)
        int total = sumWithCumulative(4, 5, 10);
        System.out.println("Total sum of all cumulative sums: " + total);

        // Demonstrate it also works with a different number of arguments
        System.out.println();
        int total2 = sumWithCumulative(3, 6);
        System.out.println("Total sum of all cumulative sums: " + total2);
    }
}
