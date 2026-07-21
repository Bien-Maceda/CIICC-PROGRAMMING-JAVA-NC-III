package ProgrammingChallenge;

import java.util.Scanner;

public class NumbertoMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int month = input.nextInt();

        int days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("Invalid month number.");
                input.close();
                return;
        }

        System.out.println("Number of days: " + days);

        input.close();
    }
}
