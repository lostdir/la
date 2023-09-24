
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to perform division:");

        try {
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();

            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");xa
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        } finally {
            scanner.close();
        }
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
}
