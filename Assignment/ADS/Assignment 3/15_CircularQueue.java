class CircularQueue {
    private int[] queue; // Array to hold the queue elements
    private int front;   // Index of the front element
    private int rear;    // Index of the rear element
    private int size;    // Maximum size of the queue
    private int count;   // Current number of elements in the queue

    // Constructor to initialize the circular queue
    public CircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % size; // Wrap around if needed
        queue[rear] = value;       // Add the new element
        count++;
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // or throw an exception
        }
        int value = queue[front];
        front = (front + 1) % size; // Wrap around if needed
        count--;
        return value;
    }

    // Check if the queue is full
    public boolean isFull() {
        return count == size;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }
    
    // Test the Circular Queue
    public static void main(String[] args) {
        // Test Case 1
        CircularQueue cq1 = new CircularQueue(4);
        cq1.enqueue(1);
        cq1.enqueue(2);
        cq1.enqueue(3);
        cq1.enqueue(4);
        System.out.println("Test Case 1: isFull() = " + cq1.isFull()); // Output: True

        // Test Case 2
        CircularQueue cq2 = new CircularQueue(3);
        cq2.enqueue(5);
        cq2.enqueue(6);
        System.out.println("Dequeued: " + cq2.dequeue()); // Dequeue 5
        cq2.enqueue(7);
        System.out.println("Test Case 2: isEmpty() = " + cq2.isEmpty()); // Output: False
    }
}
