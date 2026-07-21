package ProgrammingChallenge;

import java.util.Scanner;

public class SumandAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        input.close();
    }
}
