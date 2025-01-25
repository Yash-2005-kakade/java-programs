import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // To read user input
        Random random = new Random(); // To generate random numbers

        boolean playAgain = true; // Variable to control whether the user wants to play another round
        int totalScore = 0; // To keep track of the total score across rounds

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME CREATED BY YASH!");

        while (playAgain) {
            // Generate a random number between 1 and 100
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0; // Number of attempts in the current round
            int maxAttempts = 11; // Limit the number of attempts
            boolean guessedCorrectly = false;

            System.out.println("\nA RANDOM NUMBER BETWEEN 1 AND 100 HAS BEEN GENRATED.");
            System.out.println("YOU HAVE " + maxAttempts + " ATTEMPTS TO GUESS THE NUMBER!");

            while (attempts < maxAttempts) {
                System.out.print("\nENTER YOUR GUESS: ");
                int userGuess = scanner.nextInt(); // Read the user's guess
                attempts++;

                // Check the user's guess
                if (userGuess == numberToGuess) {
                    System.out.println("CONGRATULATIONS! YOU GUESS THE CORRECT NUMBER!");
                    guessedCorrectly = true;
                    totalScore += (maxAttempts - attempts + 1); // Higher score for fewer attempts
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("TOO LOW! TRY AGAIN.");
                } else {
                    System.out.println("TOO HIGH! TRY AGAIN.");
                }

                System.out.println("ATTEMPTS REMAINING: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("\nSORRY, YOU HAVE RUN OUT OF ATTEMPTS. THE CORRECT NUMBER WAS : " + numberToGuess + ".");
            }

            System.out.println("\nYOUR TOTAL SCORE: " + totalScore);

            // Ask the user if they want to play again
            System.out.print("\nWOULD YOU LIKE TO PLAY ANOTHER GAME (YES/NO): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("YES");
        }

        System.out.println("\nTHANK YOU FOR PLAYING ! \nYOUR TOTAL SCORE IS  " + totalScore);
        scanner.close(); // Close the scanner
    }
}
