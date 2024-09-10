package sandeep.sir;

import java.util.Scanner;
public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting two integers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Accepting an arithmetic operator from the user
        System.out.print("Enter an arithmetic operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = 0;

        // Using switch-case to perform the corresponding operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please enter one of +, -, *, or /.");
                return;
        }

        // Displaying the result
        System.out.println("The result is: " + result);
    }
}
