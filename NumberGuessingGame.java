import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 7;
        int guess = 0;

        while (guess != secretNumber) {
            System.out.print("Guess the number (1-10): ");
            guess = input.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You win!");
            }
        }

        input.close();
    }
}
