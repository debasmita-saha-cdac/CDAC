import java.util.ArrayList;
import java.util.Collections;

public class MaxHeap {
    private ArrayList<Integer> heap;

    // Constructor to initialize the heap
    public MaxHeap() {
        heap = new ArrayList<>();
    }

    // Method to insert a new element into the heap
    public void insert(int val) {
        heap.add(val);  // Add the new value to the end of the heap
        bubbleUp(heap.size() - 1);  // Restore the heap property
    }

    // Method to extract the maximum element from the heap
    public int extractMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap.get(0);  // Get the maximum element
        int last = heap.remove(heap.size() - 1);  // Remove the last element
        if (!heap.isEmpty()) {
            heap.set(0, last);  // Move the last element to the root
            bubbleDown(0);  // Restore the heap property
        }
        return max;  // Return the maximum element
    }

    // Method to maintain the Max-Heap property after insertion
    private void bubbleUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;  // Calculate the parent index
            if (heap.get(index) <= heap.get(parentIndex)) {
                break;  // If the current node is in the correct position, exit
            }
            Collections.swap(heap, index, parentIndex);  // Swap with parent
            index = parentIndex;  // Move up the tree
        }
    }

    // Method to maintain the Max-Heap property after extraction
    private void bubbleDown(int index) {
        int lastIndex = heap.size() - 1;
        while (index <= lastIndex) {
            int leftChildIndex = 2 * index + 1;  // Calculate the left child index
            int rightChildIndex = 2 * index + 2;  // Calculate the right child index
            int largestIndex = index;  // Assume the current node is the largest

            // Check if the left child exists and is larger
            if (leftChildIndex <= lastIndex && heap.get(leftChildIndex) > heap.get(largestIndex)) {
                largestIndex = leftChildIndex;
            }
            // Check if the right child exists and is larger
            if (rightChildIndex <= lastIndex && heap.get(rightChildIndex) > heap.get(largestIndex)) {
                largestIndex = rightChildIndex;
            }
            // If the largest is the current index, exit the loop
            if (largestIndex == index) {
                break;
            }
            Collections.swap(heap, index, largestIndex);  // Swap with the largest child
            index = largestIndex;  // Move down the tree
        }
    }

    // Method to print the current state of the Max-Heap
    public void printHeap() {
        System.out.print("Max-Heap = [");
        for (int i = 0; i < heap.size(); i++) {
            System.out.print(heap.get(i));
            if (i < heap.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test Case 1
        MaxHeap maxHeap1 = new MaxHeap();
        maxHeap1.insert(12);
        maxHeap1.insert(7);
        maxHeap1.insert(15);
        maxHeap1.insert(5);
        int extractedMax1 = maxHeap1.extractMax();  // Extract Max (15)
        maxHeap1.printHeap();  // Remaining Max-Heap
        System.out.println("Extracted Max = " + extractedMax1);  // Output: 15

        // Test Case 2
        MaxHeap maxHeap2 = new MaxHeap();
        maxHeap2.insert(8);
        maxHeap2.insert(20);
        maxHeap2.insert(10);
        maxHeap2.insert(3);
        int extractedMax2 = maxHeap2.extractMax();  // Extract Max (20)
        maxHeap2.printHeap();  // Remaining Max-Heap
        System.out.println("Extracted Max = " + extractedMax2);  // Output: 20
    }
}
