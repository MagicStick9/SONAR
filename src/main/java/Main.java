import java.util.Scanner;

System.out.println("First change");
System.out.println("Second change");
System.out.println("CI test update");
System.out.println("CI test run");

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter first number:");

        double a = scanner.nextDouble();

        System.out.println("Enter operator (+ - * /):");
        String op = scanner.next();

        System.out.println("Enter second number:");
        double b = scanner.nextDouble();

        double result = 0;

        if (op == "+") {              // Sonar: неправильное сравнение строк
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            result = divide(a, b);
        } else {
            System.out.println("Unknown operator");
        }

        int unused = 100; // Sonar: неиспользуемая переменная

        System.out.println("Result: " + result);

        scanner.close();
    }

    public static double divide(double a, double b) {

        try {
            return a / b;   // Sonar: возможное деление на 0
        } catch (Exception e) {
            // Sonar: пустой catch
        }

        return 0;
    }

}
