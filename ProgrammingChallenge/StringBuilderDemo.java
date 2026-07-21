package ProgrammingChallenge;

import java.util.Scanner;

public class StringBuilderDemo {
    private final StringBuilder builder;

    public StringBuilderDemo(String str) {
        this.builder = new StringBuilder(str);
    }

    public int length() {
        return builder.length();
    }

    public char charAt(int index) {
        return builder.charAt(index);
    }

    public int indexOf(String str) {
        return builder.indexOf(str);
    }

    public String substring(int start, int end) {
        return builder.substring(start, end);
    }

    public StringBuilderDemo append(String str) {
        builder.append(str);
        return this;
    }

    public StringBuilderDemo insert(int offset, String str) {
        builder.insert(offset, str);
        return this;
    }

    public StringBuilderDemo delete(int start, int end) {
        builder.delete(start, end);
        return this;
    }

    public StringBuilderDemo deleteCharAt(int index) {
        builder.deleteCharAt(index);
        return this;
    }

    public StringBuilderDemo reverse() {
        builder.reverse();
        return this;
    }

    @Override
    public String toString() {
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;

        // Validate at least 10 characters
        do {
            System.out.print("Enter a string of at least 10 characters: ");
            str = input.nextLine();
            if (str.length() < 10) {
                System.out.println("Too short! Please enter at least 10 characters.");
            }
        } while (str.length() < 10);

        StringBuilderDemo sb = new StringBuilderDemo(str);

        // 1. Length
        System.out.println("1. Length: " + sb.length());

        // 2. First character
        System.out.println("2. First character: " + sb.charAt(0));

        // 3. Last character
        System.out.println("3. Last character: " + sb.charAt(sb.length() - 1));

        // 4. Index of first occurrence of 'a'
        System.out.println("4. Index of first 'a': " + sb.indexOf("a"));

        // 5. Substring from index 3 to 6
        System.out.println("5. Substring (3 to 6): " + sb.substring(3, 6));

        // 6. Append "123"
        sb.append("123");
        System.out.println("6. After append \"123\": " + sb);

        // 7. Insert "xyz" at index 4
        sb.insert(4, "xyz");
        System.out.println("7. After insert \"xyz\" at index 4: " + sb);

        // 8. Delete substring from index 2 to 4
        sb.delete(2, 4);
        System.out.println("8. After delete (2 to 4): " + sb);

        // 9. Delete character at index 8
        sb.deleteCharAt(8);
        System.out.println("9. After deleteCharAt(8): " + sb);

        // 10. Reverse the string
        sb.reverse();
        System.out.println("10. Reversed: " + sb);

        input.close();
    }
}
