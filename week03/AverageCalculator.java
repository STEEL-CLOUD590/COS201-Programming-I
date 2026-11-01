import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter score 2: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter score 3: ");
        double score3 = scanner.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3.0;

        System.out.printf("\n--- Score Summary ---\n");
        System.out.printf("Total Score:   %.2f\n", total);
        System.out.printf("Average Score: %.2f\n", average);

        scanner.close();
    }
}