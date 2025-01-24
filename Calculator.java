import java.util.Scanner;

class Calci {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN to indicate an invalid result
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calci obj = new Calci();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0; // Initialize result

        switch (operator) {
            case '+':
                result = obj.add(a, b);
                break;
            case '-':
                result = obj.sub(a, b);
                break;
            case '*':
                result = obj.mul(a, b);
                break;
            case '/':
                result = obj.div(a, b);
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return; // Exit the program if the operator is invalid
        }

        System.out.println("Result: " + result);
        sc.close(); // Close the scanner
    }
}
