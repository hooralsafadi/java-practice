
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

        System.out.println("Has uppercase: " + hasUppercase);
        System.out.println("Has lowercase: " + hasLowercase);
        System.out.println("Has digit: " + hasDigit);
        System.out.println("Has special character: " + hasSpecial);

        if (password.length() < 8) {
            System.out.println("Weak password: use at least 8 characters.");
        } else {
            System.out.println("Password meets the minimum length requirement.");
        }

        input.close();
    }
}
