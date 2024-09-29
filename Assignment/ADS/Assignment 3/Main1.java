class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top = value]; // Increment top and insert element
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1;
        } else {
            return stackArray[top--]; // Return element and decrement top
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display the current stack
    public void displayStack() {
        System.out.print("Stack = [");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i]);
            if (i < top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Test Case 1
        Stack stack1 = new Stack(5);
        stack1.push(5);
        stack1.push(3);
        stack1.push(7);
        stack1.displayStack(); // Display current stack
        int popped1 = stack1.pop(); // Pop the top element
        stack1.displayStack(); // Display after popping
        System.out.println("Popped element = " + popped1);

        // Test Case 2
        Stack stack2 = new Stack(5);
        stack2.push(10);
        stack2.push(20);
        stack2.displayStack(); // Display current stack
        int popped2 = stack2.pop(); // Pop the top element
        stack2.push(15);
        stack2.displayStack(); // Display after popping and pushing
        System.out.println("Popped element = " + popped2);
    }
}
