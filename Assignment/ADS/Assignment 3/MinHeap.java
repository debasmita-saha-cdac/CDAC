import java.util.ArrayList;
import java.util.Collections;

public class MinHeap {
    private ArrayList<Integer> heap;

    // Constructor to initialize the heap
    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Method to insert a new element into the heap
    public void insert(int val) {
        heap.add(val);  // Add the new value to the end of the heap
        bubbleUp(heap.size() - 1);  // Restore the heap property
    }

    // Method to extract the minimum element from the heap
    public int extractMin() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap.get(0);  // Get the minimum element
        int last = heap.remove(heap.size() - 1);  // Remove the last element
        if (!heap.isEmpty()) {
            heap.set(0, last);  // Move the last element to the root
            bubbleDown(0);  // Restore the heap property
        }
        return min;  // Return the minimum element
    }

    // Method to maintain the Min-Heap property after insertion
    private void bubbleUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;  // Calculate the parent index
            if (heap.get(index) >= heap.get(parentIndex)) {
                break;  // If the current node is in the correct position, exit
            }
            Collections.swap(heap, index, parentIndex);  // Swap with parent
            index = parentIndex;  // Move up the tree
        }
    }

    // Method to maintain the Min-Heap property after extraction
    private void bubbleDown(int index) {
        int lastIndex = heap.size() - 1;
        while (index <= lastIndex) {
            int leftChildIndex = 2 * index + 1;  // Calculate the left child index
            int rightChildIndex = 2 * index + 2;  // Calculate the right child index
            int smallestIndex = index;  // Assume the current node is the smallest

            // Check if the left child exists and is smaller
            if (leftChildIndex <= lastIndex && heap.get(leftChildIndex) < heap.get(smallestIndex)) {
                smallestIndex = leftChildIndex;
            }
            // Check if the right child exists and is smaller
            if (rightChildIndex <= lastIndex && heap.get(rightChildIndex) < heap.get(smallestIndex)) {
                smallestIndex = rightChildIndex;
            }
            // If the smallest is the current index, exit the loop
            if (smallestIndex == index) {
                break;
            }
            Collections.swap(heap, index, smallestIndex);  // Swap with the smallest child
            index = smallestIndex;  // Move down the tree
        }
    }

    // Method to print the current state of the Min-Heap
    public void printHeap() {
        System.out.print("Min-Heap = [");
        for (int i = 0; i < heap.size(); i++) {
            System.out.print(heap.get(i));
            if (i < heap.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test Case 1
        MinHeap minHeap1 = new MinHeap();
        minHeap1.insert(10);
        minHeap1.insert(15);
        minHeap1.insert(20);
        minHeap1.insert(17);
        int extractedMin1 = minHeap1.extractMin();  // Extract Min (10)
        minHeap1.printHeap();  // Remaining Min-Heap
        System.out.println("Extracted Min = " + extractedMin1);  // Output: 10

        // Test Case 2
        MinHeap minHeap2 = new MinHeap();
        minHeap2.insert(30);
        minHeap2.insert(40);
        minHeap2.insert(20);
        minHeap2.insert(50);
        int extractedMin2 = minHeap2.extractMin();  // Extract Min (20)
        minHeap2.printHeap();  // Remaining Min-Heap
        System.out.println("Extracted Min = " + extractedMin2);  // Output: 20
    }
}
