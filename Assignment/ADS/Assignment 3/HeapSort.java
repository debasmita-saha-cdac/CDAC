import java.util.Arrays;

public class HeapSort {
    
    // Method to perform heap sort on an array
    public static void heapSort(int[] array) {
        int n = array.length;

        // Build a max heap from the array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is an index in array[]
    static void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(array, n, largest);
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] array1 = {5, 1, 12, 3, 9};
        heapSort(array1);
        System.out.println("Sorted Output: " + Arrays.toString(array1));  // Output: [1, 3, 5, 9, 12]

        // Test Case 2
        int[] array2 = {20, 15, 8, 10};
        heapSort(array2);
        System.out.println("Sorted Output: " + Arrays.toString(array2));  // Output: [8, 10, 15, 20]
    }
}
