import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.printf("\n--- Results ---\n");
        System.out.printf("Addition:       %.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
        System.out.printf("Subtraction:    %.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));
        System.out.printf("Multiplication: %.2f * %.2f = %.2f\n", num1, num2, (num1 * num2));
        
        if (num2 != 0) {
            System.out.printf("Division:       %.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
        } else {
            System.out.println("Division:       Cannot divide by zero");
        }

        scanner.close();
    }
}
