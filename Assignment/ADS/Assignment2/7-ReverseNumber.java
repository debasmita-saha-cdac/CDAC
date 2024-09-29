/*
7. Reverse a Number
Problem: Write a Java program to reverse a given number.

Test Cases:

Input: 12345
Output: 54321
Input: -9876
Output: -6789
*/

public class ReverseNumber {
    public static void main(String[] args) {
        // Test cases
        int input1 = 12345;
        System.out.println("Input: " + input1);
        System.out.println("Output: " + reverseNumber(input1));

        int input2 = -9876;
        System.out.println("Input: " + input2);
        System.out.println("Output: " + reverseNumber(input2));
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        int sign = 1;

        // Check for negative number
        if (number < 0) {
            sign = -1; // Store the sign
            number = -number; // Make the number positive
        }

        // Reverse the digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to reversed
            number /= 10; // Remove the last digit from the number
        }

        return reversed * sign; // Restore the sign
    }
}
