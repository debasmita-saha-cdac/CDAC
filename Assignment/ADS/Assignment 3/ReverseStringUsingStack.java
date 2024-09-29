import java.util.Stack;

public class ReverseStringUsingStack {

    // Function to reverse a string using a stack
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the input string onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters from the stack to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        // Test Case 1
        String testCase1 = "hello";
        System.out.println("Input: " + testCase1);
        System.out.println("Output: " + reverseString(testCase1));

        // Test Case 2
        String testCase2 = "world";
        System.out.println("Input: " + testCase2);
        System.out.println("Output: " + reverseString(testCase2));
    }
}
