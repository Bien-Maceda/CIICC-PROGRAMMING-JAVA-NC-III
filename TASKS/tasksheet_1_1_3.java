package TASKS;

public class tasksheet_1_1_3 {
    public static void main(String[] args) {
        // Step 2: Create an int variable named check_number with an initial value of 10
        int check_number = 10;

        // Step 3: Create a String variable named message
        String message;

        // Step 4 & 5: Loop from 1 up to check_number
        for (int i = 1; i <= check_number; i++) {
            // Step 5 Syntax provided in the task sheet
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            
            // Step 6: Print the message value
            System.out.println(message);
        }
    }
}
