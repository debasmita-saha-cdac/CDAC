import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for the number of rows in the triangle
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();
        
        // Print the right triangle pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star
            }
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close(); // Close the scanner
    }
}
