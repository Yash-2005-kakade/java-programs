import java.util.Scanner; // Import the Scanner class to read user input

// Define a class for performing calculations
class Calci {
    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double sub(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double mul(double a, double b) {
        return a * b;
    }

    // Method for division
    public double div(double a, double b) {
        if (b != 0) { // Check to prevent division by zero
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN (Not a Number) if division by zero occurs
        }
    }
}

// Main class for the calculator application
public class Calculator {
    public static void main(String[] args) {
        Calci obj = new Calci(); // Create an instance of the Calci class
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Prompt user to enter the first number
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();

        // Prompt user to enter the second number
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();

        // Prompt user to enter the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0); // Read the operator as a single character

        double result = 0; // Initialize a variable to store the result of the calculation

        // Use a switch statement to perform the operation based on the operator
        switch (operator) {
            case '+': // If the operator is '+', perform addition
                result = obj.add(a, b);
                break;
            case '-': // If the operator is '-', perform subtraction
                result = obj.sub(a, b);
                break;
            case '*': // If the operator is '*', perform multiplication
                result = obj.mul(a, b);
                break;
            case '/': // If the operator is '/', perform division
                result = obj.div(a, b);
                break;
            default: // If the operator is invalid, display an error message
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return; // Exit the program
        }

        // Display the result of the calculation
        System.out.println("Result: " + result);

        sc.close(); // Close the scanner to release system resources
    }
}

