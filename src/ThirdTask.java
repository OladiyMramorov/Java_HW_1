import java.util.Scanner;

public class ThirdTask {
    static void ThirdTask()
    {
        System.out.println("Задание 3");
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Введите первое число:");
        num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        num2 = scanner.nextDouble();
        System.out.println("Введите операцию (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        scanner.close();
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
                System.out.println("Операция не распознана!");
                return;
        }
        System.out.println("Результат: " + result);
    }
}
