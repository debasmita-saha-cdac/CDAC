import java.util.Stack;

public class InfixToPostfix {

    // Function to convert an infix expression to a postfix expression
    public static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        // Traverse the input expression
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is an operand (letter), add it to the output
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch).append(' ');
            }
            // If the character is '(', push it to the stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If the character is ')', pop and append to output until '(' is found
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop(); // Pop the '('
            }
            // If the character is an operator, pop operators with higher or equal precedence
            else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString().trim();
    }

    // Helper function to check if a character is an operator
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    // Helper function to return the precedence of operators
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        String testCase1 = "A + B * C";
        System.out.println("Input: " + testCase1);
        System.out.println("Output: " + infixToPostfix(testCase1));  // Output: "A B C * +"

        // Test Case 2
        String testCase2 = "A * B + C / D";
        System.out.println("Input: " + testCase2);
        System.out.println("Output: " + infixToPostfix(testCase2));  // Output: "A B * C D / +"
    }
}
