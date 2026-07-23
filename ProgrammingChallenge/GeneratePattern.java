package ProgrammingChallenge;

import java.util.Scanner;

public class GeneratePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
