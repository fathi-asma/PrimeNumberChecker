import java.util.Scanner;

public class checkPrimeOrNot {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Line space for correct formatting
        System.out.println();

        // Check if the entered number is negative or positive
        if (number < 0) {
            System.out.println("Enter a non-negative number:");
        } else {
            int factorCounter = 0; // Count factors

            // Loop for counting the number of factors
            for (int j = 1; j <= number; j++) {
                if (number % j == 0) {
                    factorCounter++;
                }
            }

            // Display the number and its factors
            System.out.println("Number: " + number);
            System.out.println("Factor count: " + factorCounter);

            // Determine if the entered number is prime or not
            if (number == 0 || number == 1) {
                System.out.println("Status: Non-Primary number");
            } else if (factorCounter == 2) {
                System.out.println("Status: Primary number");
            } else {
                System.out.println("Status: Not a prime number");
            }
        }

        input.close();
    }
}