import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, result;
        char operator;
        Scanner reader = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.println("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();

        // Prompt the user to enter an operator
        System.out.println("Enter an operator (+, -, *, /): ");
        operator = reader.next().charAt(0);

        // Perform the calculation based on the operator using a switch statement
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
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
        }

        // Close the scanner
        reader.close();
    }
}