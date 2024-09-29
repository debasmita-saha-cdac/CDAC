import java.util.PriorityQueue;

class PriorityQueueElement implements Comparable<PriorityQueueElement> {
    int value; // The value of the element
    int priority; // The priority of the element

    public PriorityQueueElement(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    // Override the compareTo method for Max-Heap (higher priority comes first)
    @Override
    public int compareTo(PriorityQueueElement other) {
        return Integer.compare(other.priority, this.priority); // Max-Heap
    }
}

public class PriorityQueueImplementation {
    private PriorityQueue<PriorityQueueElement> queue;

    public PriorityQueueImplementation() {
        queue = new PriorityQueue<>();
    }

    // Enqueue method to add an element with a priority
    public void enqueue(int value, int priority) {
        queue.offer(new PriorityQueueElement(value, priority));
    }

    // Dequeue method to remove and return the highest priority element
    public int dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.poll().value; // Remove and return the highest priority element
    }

    // Method to get the current state of the queue
    public String getQueueElements() {
        StringBuilder sb = new StringBuilder();
        for (PriorityQueueElement element : queue) {
            sb.append(element.value).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        PriorityQueueImplementation pq = new PriorityQueueImplementation();

        // Test Case 1
        pq.enqueue(3, 1);
        pq.enqueue(10, 3);
        pq.enqueue(5, 2);
        int dequeuedElement1 = pq.dequeue(); // Should dequeue 10 (highest priority)
        System.out.println("Dequeued element = " + dequeuedElement1 + ", Priority Queue = [" + pq.getQueueElements() + "]");

        // Test Case 2
        PriorityQueueImplementation pq2 = new PriorityQueueImplementation();
        pq2.enqueue(7, 4);
        pq2.enqueue(8, 2);
        pq2.enqueue(6, 3);
        int dequeuedElement2 = pq2.dequeue(); // Should dequeue 7 (highest priority)
        System.out.println("Dequeued element = " + dequeuedElement2 + ", Priority Queue = [" + pq2.getQueueElements() + "]");
    }
}
