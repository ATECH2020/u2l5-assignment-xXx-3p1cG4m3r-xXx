import java.util.Scanner;

public class ConstructionTester {
    public static void main(String[] args) {
			  Scanner scanner = new Scanner(System.in);
        int lumberCost = 8;
				int windowCost = 11;

				System.out.println("Enter the sales tax rate: ");
				double salesTax = scanner.nextDouble();
				System.out.println("How many boards do you need? ");
				int numBoard = scanner.nextInt();
				System.out.println("How many windows do you need? ");
				int numWindows = scanner.nextInt();

				double total = (numBoard * lumberCost) + (numWindows * windowCost);
				System.out.println("Total: " + total);
				System.out.print("Grand Total: " + (total * (1+ salesTax)));
    }
}
