package codingChallenge;

import java.util.Scanner;

public class Q1 {

    // Method to calculate GCD using Euclid's Algorithm
    public static int gcd(int a, int b) {
        // Euclidean Algorithm: Repeat until b becomes zero
        while (b != 0) {
            int temp = b;
            b = a % b;  // Replace 'a' with the remainder of 'a' divided by 'b'
            a = temp;   // Replace 'b' with the previous value of 'a'
        }
        return a;  // When b becomes zero, a is the GCD
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two positive integers from the user
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();
        
        // Call the GCD method and store the result
        int gcdResult = gcd(num1, num2);
        
        // Display the GCD of the two numbers
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
        
        // Verifying Bézout's identity (optional but aligns with the question)
        System.out.println("Verifying using Bézout's identity...");
        bezoutIdentity(num1, num2, gcdResult);
        
        scanner.close();
    }

    // Bézout's identity verification using the Extended Euclidean Algorithm
    public static void bezoutIdentity(int a, int b, int gcd) {
        int[] result = extendedGCD(a, b);
        int x = result[0];
        int y = result[1];
        
        System.out.println("Bézout's coefficients: x = " + x + ", y = " + y);
        System.out.println("Verification: " + a + " * (" + x + ") + " + b + " * (" + y + ") = " + gcd);
    }

    // Extended Euclidean Algorithm to calculate Bézout's coefficients
    public static int[] extendedGCD(int a, int b) {
        if (b == 0) {
            return new int[]{1, 0};  // Base case: a * 1 + b * 0 = gcd(a, 0)
        }
        int[] result = extendedGCD(b, a % b);  // Recursive call
        int x = result[1];  // x' = y
        int y = result[0] - (a / b) * result[1];  // y' = x - (a / b) * y
        
        return new int[]{x, y};
    }
}
