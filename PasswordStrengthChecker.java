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

        if (password.length() < 8) {
            System.out.println("Weak password: use at least 8 characters.");
        } else {
            System.out.println("Password meets the minimum length requirement.");
        }

        input.close();
    }
}
