import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /) ");
        char operator = scanner.next().charAt(0);
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch(operator) {
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
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
