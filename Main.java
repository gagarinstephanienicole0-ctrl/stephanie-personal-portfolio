import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(20) + 1;
        int guess;
        int attempts = 0;

        System.out.println("================================");
        System.out.println("     NUMBER GUESSING GAME");
        System.out.println("================================");
        System.out.println("I have a secret number from 1 to 20.");
        System.out.println("Try to guess the correct number!");

        do {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } 
            else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } 
            else {
                System.out.println("Congratulations! You guessed it!");
                System.out.println("The secret number is " + secretNumber);
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != secretNumber);

        System.out.println("\nThank you for playing!");
        input.close();
    }
}
