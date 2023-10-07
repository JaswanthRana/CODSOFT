package numbergame;
import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        do {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            
            System.out.println("I've generated a random number between " + minRange + " and " + maxRange + ". Try to guess it!");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                
                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + generatedNumber);
                }
            }
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            
            if (playAgain.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);
        
        System.out.println("Thanks for playing! Your total score is: " + score);
        scanner.close();
    }
}


