import java.util.PriorityQueue;

public class KthLargestInStream {

    // Method to find the kth largest element in a stream of numbers
    public static int findKthLargest(int[] stream, int k) {
        // Create a Min-Heap to keep track of the top k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : stream) {
            minHeap.offer(num); // Add the current number to the heap

            // If the size of the heap exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The root of the heap is the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] stream1 = {3, 10, 5, 20, 15};
        int k1 = 3;
        System.out.println("The " + k1 + "th largest element is: " + findKthLargest(stream1, k1));  // Output: 10

        // Test Case 2
        int[] stream2 = {7, 4, 8, 2, 9};
        int k2 = 2;
        System.out.println("The " + k2 + "th largest element is: " + findKthLargest(stream2, k2));  // Output: 8
    }
}
