/*
8. Array Manipulation
Problem: Perform a series of operations to manipulate an array based on range update queries. Each query adds a value to a range of indices.

Test Cases:

Input: n = 5, queries = [[1, 2, 100], [2, 5, 100], [3, 4, 100]]
Output: 200
Input: n = 4, queries = [[1, 3, 50], [2, 4, 70]]
Output: 120
*/

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        // Test Case 1
        int n1 = 5;
        int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        System.out.println(maxValue(n1, queries1)); // Output: 200

        // Test Case 2
        int n2 = 4;
        int[][] queries2 = {{1, 3, 50}, {2, 4, 70}};
        System.out.println(maxValue(n2, queries2)); // Output: 120
    }

    static long maxValue(int n, int[][] queries) {
        long[] arr = new long[n + 1]; // Use long to handle large sums

        // Apply the range update using prefix sum technique
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            long value = query[2];

            arr[start] += value; // Add value at the start index
            if (end + 1 <= n) {
                arr[end + 1] -= value; // Subtract value just after the end index
            }
        }

        long max = 0;
        long currentSum = 0;

        // Calculate the maximum value in the array
        for (int i = 1; i <= n; i++) {
            currentSum += arr[i]; // Calculate the prefix sum
            if (currentSum > max) {
                max = currentSum; // Update max if current sum is greater
            }
        }

        return max;
    }
}
