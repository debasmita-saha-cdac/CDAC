import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 1, 2};
        int newLength1 = removeDuplicates(arr1);
        System.out.println("New length: " + newLength1);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOf(arr1, newLength1)));

        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};
        int newLength2 = removeDuplicates(arr2);
        System.out.println("New length: " + newLength2);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOf(arr2, newLength2)));
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case
        
        int uniqueIndex = 1; // Pointer for the position of the next unique element
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // Check for a new unique element
                arr[uniqueIndex] = arr[i]; // Move the unique element to the uniqueIndex
                uniqueIndex++; // Increment the uniqueIndex
            }
        }
        
        return uniqueIndex; // Return the length of the unique elements
    }
}
