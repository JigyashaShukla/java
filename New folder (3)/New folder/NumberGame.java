import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        // Generate a random number within the specified range (1 to 100)
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        // Initialize variables
        int userGuess;
        boolean isCorrect = false;
        Scanner scanner = new Scanner(System.in);

        
        while (!isCorrect) {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess (between 1 and 100): ");
            userGuess = scanner.nextInt();

            // Compare the user's guess with the generated number
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a valid number between 1 and 100.");
            } else if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                isCorrect = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        
        scanner.close();
    }
}
