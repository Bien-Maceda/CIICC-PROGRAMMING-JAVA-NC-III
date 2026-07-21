package ProgrammingChallenge;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // 1. Length of the string
        System.out.println("Length: " + str.length());

        // 2. Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. First character
        System.out.println("First character: " + str.charAt(0));

        // 5. Last character
        System.out.println("Last character: " + str.charAt(str.length() - 1));

        // 6. Substring from 2nd to 5th character
        System.out.println("Substring (2nd to 5th character): " + str.substring(1, 5));

        input.close();
    }
}