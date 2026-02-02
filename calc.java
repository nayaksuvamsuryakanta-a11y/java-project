import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        double num1, num2, result;
        char operator;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        operator = reader.next().charAt(0);

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
                System.out.println("Error! Invalid operator. Please enter +, -, *, or /.");
        }

        reader.close(); // Close the scanner
    }
}
