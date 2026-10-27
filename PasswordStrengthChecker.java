
import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password to check: ");
        String password = input.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }

            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        int score = 0;

        if (password.length() >= 8) {
            score++;
        }

        if (password.length() >= 12) {
            score++;
        }

        if (hasUppercase) {
            score++;
        }

        if (hasLowercase) {
            score++;
        }

        if (hasDigit) {
            score++;
        }

        if (hasSpecial) {
            score++;
        }

        System.out.println("Password score: " + score + "/6");

        if (score <= 2) {
            System.out.println("Strength: Weak");
        } else if (score <= 4) {
            System.out.println("Strength: Moderate");
        } else {
            System.out.println("Strength: Strong");
        }
        
        if (password.length() < 8) {
            System.out.println("Weak password: use at least 8 characters.");
        } else {
            System.out.println("Password meets the minimum length requirement.");
        }

        input.close();
    }
}
