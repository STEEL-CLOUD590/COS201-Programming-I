import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.printf("\n--- Receipt ---\n");
        System.out.printf("Quantity:   %d\n", quantity);
        System.out.printf("Unit Price: $%,.2f\n", unitPrice);
        System.out.printf("Total Cost: $%,.2f\n", totalCost);

        scanner.close();
    }
}