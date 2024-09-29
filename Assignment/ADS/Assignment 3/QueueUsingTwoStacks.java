import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor to initialize the stacks
    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Method to enqueue an element to the queue
    public void enqueue(int element) {
        stack1.push(element);  // Push element onto stack1
    }

    // Method to dequeue an element from the queue
    public Integer dequeue() {
        if (stack2.isEmpty()) {  // If stack2 is empty, move elements from stack1
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return null;  // Return null if the queue is empty
        }
        return stack2.pop();  // Pop the top element from stack2
    }

    // Method to print the current state of the queue
    public void printQueue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue = [");
        // Print elements from stack2 (if any)
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i));
            if (i > 0) System.out.print(", ");
        }
        // Print elements from stack1 (if any)
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i));
            if (i < stack1.size() - 1 || stack2.isEmpty()) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test Case 1
        QueueUsingTwoStacks queue1 = new QueueUsingTwoStacks();
        queue1.enqueue(3);
        queue1.enqueue(7);
        int dequeuedElement1 = queue1.dequeue();  // Dequeue 3
        queue1.printQueue();
        System.out.println("Dequeued element = " + dequeuedElement1);

        // Test Case 2
        QueueUsingTwoStacks queue2 = new QueueUsingTwoStacks();
        queue2.enqueue(10);
        queue2.enqueue(20);
        int dequeuedElement2_1 = queue2.dequeue();  // Dequeue 10
        int dequeuedElement2_2 = queue2.dequeue();  // Dequeue 20
        queue2.printQueue();
        System.out.println("Dequeued elements = " + dequeuedElement2_1 + ", " + dequeuedElement2_2);
    }
}
