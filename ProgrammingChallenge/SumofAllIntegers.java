package ProgrammingChallenge;

import java.util.Scanner;

public class SumofAllIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter integers to add (enter 0 to stop):");

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Sum of all integers entered: " + sum);

        input.close();
    }
}