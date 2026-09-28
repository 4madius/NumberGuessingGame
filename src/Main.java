import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            int secret = random.nextInt(100) + 1;
            //System.out.println("The secret number is: " + secret); //display secret number

            int guess = 0;
            int attempt = 0;

            while (guess != secret) {
                System.out.print("Guess a number from (1-100): ");
                guess = scanner.nextInt();
                attempt++;

                //System.out.println("You guessed: " + guess);

                if (guess < secret) {
                    System.out.println("Too low");
                } else if (guess > secret) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Correct!!! The secret number is :" + secret);
                    System.out.println("Total attempt: " + attempt);

                }
            }

            System.out.print("Do you want to play again? (y/n)");
            again = scanner.next();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing.");
    }
}
