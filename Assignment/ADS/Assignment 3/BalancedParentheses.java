import java.util.Stack;

public class BalancedParentheses {

    // Function to check if parentheses are balanced
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the expression
        for (char ch : expression.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // When a closing bracket is encountered
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty or top of the stack doesn't match the closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // If stack is empty at the end, all brackets were matched; otherwise, they weren't
        return stack.isEmpty();
    }

    // Helper function to check if the opening and closing brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // Test Case 1
        String testCase1 = "({[()]})";
        if (isBalanced(testCase1)) {
            System.out.println("Test Case 1 Output: Balanced");
        } else {
            System.out.println("Test Case 1 Output: Not Balanced");
        }

        // Test Case 2
        String testCase2 = "([)]";
        if (isBalanced(testCase2)) {
            System.out.println("Test Case 2 Output: Not Balanced");
        } else {
            System.out.println("Test Case 2 Output: Balanced");
        }
    }
}
