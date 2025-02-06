import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num1, num2, result;
    char operator;

    System.out.println("Simple Calculator");
    System.out.println("Enter first number: ");
    num1 = scanner.nextDouble();

    System.out.println("Enter operator (+, -, *, /): ");
    operator = scanner.next().charAt(0);

    System.out.println("Enter second number: ");
    num2 = scanner.nextDouble();

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
          System.out.println("Error: Cannot divide by zero!");
        }
        break;
      default:
        System.out.println("Error: Invalid operator!");
    }
    scanner.close();
  }
}