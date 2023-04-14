import java.util.Scanner;

public class FirstTask {
        static void FirstTask()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 1");
            System.out.print("Введите n: ");
            int n = scanner.nextInt();
            TrianglePlusFactorial(n);
            scanner.close();
        }

        static void TrianglePlusFactorial(int n)
        {
            int sum = 0;
            int fact = 1;
            for(int i = 1; i <= n; i++)
            {
                sum += i;
                fact *= i;
            }
            System.out.println("n = " + n);
            System.out.println("Треугольное число " + n + " = " + sum);
            System.out.println(n + "! = " + fact);
        }
}
