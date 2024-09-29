/*
9. String Palindrome
Problem: Write a Java program to check if a given string is a palindrome.

Test Cases:

Input: "madam"
Output: true
Input: "hello"
Output: false
Here’s a continuation of the list of assignment questions starting from question 21, with two test cases for each:

*/

public class PalindromeChecker {
    public static void main(String[] args) {
        // Test Case 1
        String input1 = "madam";
        System.out.println(isPalindrome(input1)); // Output: true

        // Test Case 2
        String input2 = "hello";
        System.out.println(isPalindrome(input2)); // Output: false
    }

    static boolean isPalindrome(String str) {
        // Convert the string to lower case to ensure case insensitivity
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Check characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
}
