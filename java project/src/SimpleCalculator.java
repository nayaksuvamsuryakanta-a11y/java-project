
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1, num2, result;
        char operator;
        Scanner reader = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
        num1 = reader.nextDouble();
        System.out.print("Enter second number: ");
        num2 = reader.nextDouble();

        // Prompt the user to enter an operator
        System.out.print("\nEnter an operator (+, -, *, /): ");
        operator = reader.next().charAt(0);

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error! Invalid operator. Please use +, -, *, or /");
        }

        reader.close(); // Close the scanner
    }
}
