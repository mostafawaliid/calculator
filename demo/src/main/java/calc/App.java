package calc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.println("Enter first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.printf("Result: %.2f\n", result);
    }
}

    

