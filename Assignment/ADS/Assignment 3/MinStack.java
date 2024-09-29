import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push an element onto the stack
    public void push(int value) {
        mainStack.push(value);
        // Push onto minStack if it's empty or the new value is less than or equal to the current min
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = mainStack.pop();
        // If the popped value is the minimum, pop it from the minStack as well
        if (value == minStack.peek()) {
            minStack.pop();
        }
        return value;
    }

    // Get the minimum element from the stack
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }
    
    public static void main(String[] args) {
        MinStack minStack1 = new MinStack();
        // Test Case 1
        minStack1.push(5);
        minStack1.push(3);
        minStack1.push(7);
        System.out.println("Min = " + minStack1.getMin()); // Output: Min = 3

        MinStack minStack2 = new MinStack();
        // Test Case 2
        minStack2.push(10);
        minStack2.push(8);
        minStack2.push(6);
        minStack2.push(12);
        System.out.println("Min = " + minStack2.getMin()); // Output: Min = 6
    }
}
