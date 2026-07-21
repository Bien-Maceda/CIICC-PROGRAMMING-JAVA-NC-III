package ProgrammingChallenge;

import java.util.Scanner;

public class CountNumberofWords {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Trim leading/trailing spaces, then split on one or more whitespace characters
        String trimmed = sentence.trim();

        if (trimmed.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = trimmed.split("\\s+");
            System.out.println("Word count: " + words.length);
        }

        input.close();
    }
}
