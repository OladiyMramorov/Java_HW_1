import java.util.Scanner;

public class FourthTask {
    static void FourthTask()
    {
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение вида q + w = e, где q, w, e >= 0: ");
        String equation = scanner.nextLine();

        String answer = new String();

        boolean foundSolution = false;
        int countQuestionMarks = equation.length() - equation.replace("?", "").length();
        for (int i = 0; i <= 9; i++)
        {
            for (int j = 0; j <= 9; j++)
            {
                if (i == j && countQuestionMarks == 1) continue;
                String temp = equation.replace("?", Integer.toString(i)).replaceFirst("\\?", Integer.toString(j));
                if (isValidEquation(temp))
                {
                    answer = temp;
                    foundSolution = true;
                }
            }
        }
        if(foundSolution == false)
        {
            System.out.println("Решений нет");
        }
        else
        {
            System.out.println(answer);
        }
        scanner.close();

    }

    public static boolean isValidEquation(String equation)
    {
        String[] splitEquation = equation.split("=");
        int q = 0, w = 0, e = 0;
        try
        {
            q = Integer.parseInt(splitEquation[0].split("\\+")[0].trim());
            w = Integer.parseInt(splitEquation[0].split("\\+")[1].trim());
            e = Integer.parseInt(splitEquation[1].trim());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e1)
        {
            return false;
        }
        return q + w == e;
    }
}
