import java.util.Stack;

public class EvaluatePostfix {

    // Function to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Split the input string by spaces to process each part
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            // If the token is a number, push it onto the stack
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            }
            // If the token is an operator, pop operands and apply the operator
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = applyOperator(token.charAt(0), operand1, operand2);
                stack.push(result);
            }
        }

        // The result is the only remaining element in the stack
        return stack.pop();
    }

    // Function to check if a string is numeric
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Function to apply the operator on two operands
    private static int applyOperator(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        String testCase1 = "5 3 + 2 *";
        System.out.println("Input: " + testCase1);
        System.out.println("Output: " + evaluatePostfix(testCase1)); // Output: 16

        // Test Case 2
        String testCase2 = "4 5 * 6 /";
        System.out.println("Input: " + testCase2);
        System.out.println("Output: " + evaluatePostfix(testCase2)); // Output: 3
    }
}
