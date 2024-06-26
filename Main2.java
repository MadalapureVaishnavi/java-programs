public class Main2 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half of the diamond
        for (int i = 1; i  <= n; i++) {
            // Print left half of the row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j  <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right half of the row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n; i  >= 1; i--) {
            // Print left half of the row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j  <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right half of the row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}