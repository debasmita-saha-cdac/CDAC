public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to enqueue an element to the queue
    public void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    // Method to dequeue an element from the queue
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1; // Return -1 if queue is empty
        }
        int dequeuedElement = queue[front];
        front = (front + 1) % capacity;
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
        ArrayQueue queue1 = new ArrayQueue(5);
        queue1.enqueue(5);
        queue1.enqueue(10);
        int dequeuedElement1 = queue1.dequeue();
        queue1.printQueue();
        System.out.println("Dequeued element = " + dequeuedElement1);

        // Test Case 2
        ArrayQueue queue2 = new ArrayQueue(5);
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        int dequeuedElement2_1 = queue2.dequeue();
        int dequeuedElement2_2 = queue2.dequeue();
        queue2.printQueue();
        System.out.println("Dequeued elements = " + dequeuedElement2_1 + ", " + dequeuedElement2_2);
    }
}
