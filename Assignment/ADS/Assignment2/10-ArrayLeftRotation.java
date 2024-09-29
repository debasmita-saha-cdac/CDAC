/*
10. Array Left Rotation
Problem: Write a Java program to rotate an array to the left by d positions.

Test Cases:

Input: arr = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Input: arr = [10, 20, 30, 40], d = 1
Output: [20, 30, 40, 10]
*/

import java.util.Arrays;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int d1 = 2;
        System.out.println(Arrays.toString(leftRotate(arr1, d1))); // Output: [3, 4, 5, 1, 2]

        // Test Case 2
        int[] arr2 = {10, 20, 30, 40};
        int d2 = 1;
        System.out.println(Arrays.toString(leftRotate(arr2, d2))); // Output: [20, 30, 40, 10]
    }

    static int[] leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d >= n
        int[] rotatedArr = new int[n];

        // Fill the new rotated array
        for (int i = 0; i < n; i++) {
            rotatedArr[i] = arr[(i + d) % n];
        }
        return rotatedArr;
    }
}
