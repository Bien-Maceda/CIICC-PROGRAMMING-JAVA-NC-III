package ProgrammingChallenge;

import java.util.Scanner;

public class CheckVowelsConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        // Convert to lowercase so the check works regardless of case
        char lower = Character.toLowerCase(letter);

        if (Character.isLetter(lower)) {
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        } else {
            System.out.println(letter + " is not a valid letter.");
        }

        input.close();
    }
}
