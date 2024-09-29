public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to enqueue an element to the circular queue
    public void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;  // Move rear pointer to next position
        queue[rear] = element;
        size++;
    }

    // Method to dequeue an element from the circular queue
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1; // Return -1 if the queue is empty
        }
        int dequeuedElement = queue[front];
        front = (front + 1) % capacity;  // Move front pointer to next position
        size--;
        return dequeuedElement;
    }

    // Method to print the current state of the queue
    public void printQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue = [");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test Case 1
        CircularQueue queue1 = new CircularQueue(5);
        queue1.enqueue(4);
        queue1.enqueue(5);
        queue1.enqueue(6);
        queue1.enqueue(7);
        int dequeuedElement1 = queue1.dequeue();  // Dequeue 4
        queue1.enqueue(8);  // Enqueue 8
        queue1.printQueue();
        System.out.println("Dequeued element = " + dequeuedElement1);

        // Test Case 2
        CircularQueue queue2 = new CircularQueue(5);
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.enqueue(4);
        int dequeuedElement2_1 = queue2.dequeue();  // Dequeue 1
        int dequeuedElement2_2 = queue2.dequeue();  // Dequeue 2
        queue2.enqueue(5);  // Enqueue 5
        queue2.printQueue();
        System.out.println("Dequeued elements = " + dequeuedElement2_1 + ", " + dequeuedElement2_2);
    }
}
