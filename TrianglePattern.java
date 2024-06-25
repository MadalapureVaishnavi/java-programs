import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows for the triangle from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop through the rows
        for (int i = 1; i <= rows; i++) {
            // Loop through the columns
            for (int j = 1; j <= i; j++) {
                // Print asterisk without newline
                System.out.print("* ");
            }
            // Print a newline after each row
            System.out.println();
        }
    }
}
