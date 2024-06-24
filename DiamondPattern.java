import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();

        if (rows % 2 == 0) {
            System.out.println("Number of rows must be odd.");
            return;
        }

        int midRow = rows / 2 + 1;
        int num = 1;

        // Upper half of the diamond
        for (int i = 1; i <= midRow; i++) {
            // Printing spaces
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }

            // Printing numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num++);
            }
            System.out.println();
        }

        // Lower half of the diamond
        num -= 2; // Adjusting the number for the lower half
        for (int i = midRow - 1; i >= 1; i--) {
            // Printing spaces
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }

            // Printing numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num--);
            }
            System.out.println();
            num = num - (2 * (i - 1) + 1);
        }
    }
}
