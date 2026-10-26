import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first mark: ");
        double mark1 = input.nextDouble();

        System.out.print("Enter your second mark: ");
        double mark2 = input.nextDouble();

        System.out.print("Enter your third mark: ");
        double mark3 = input.nextDouble();

        double average = (mark1 + mark2 + mark3) / 3;

        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 80) {
            System.out.println("Grade B");
        } else if (average >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Needs improvement");
        }

        input.close();
    }
}
