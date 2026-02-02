
import java.util.Scanner; // Import the Scanner class to read input

public class Main {
    public static void main(String[] args) {
        // Declare variables
        double num1, num2, result;
        char operator;

        Scanner input = new Scanner(System.in);

        // Prompt user to choose an operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0); // Read the operator character

        // Prompt user to enter numbers
        System.out.println("Enter first number:");
        num1 = input.nextDouble(); // Read the first number

        System.out.println("Enter second number:");
        num2 = input.nextDouble(); // Read the second number

        result = 0; // Initialize result

        // Perform calculation based on the operator
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
                    System.out.println("Error! Division by zero is not allowed.");
                    return; // Exit the program if division by zero
                }
                break;
            default:
                System.out.println("Error! Invalid operator. Please enter +, -, *, or /");
                return; // Exit the program for invalid input
        }

        // Print the result
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        input.close(); // Close the scanner
    }
}
