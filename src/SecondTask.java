public class SecondTask {
    static void SecondTask()
    {
        System.out.println("Задание 2");
        for (int i = 2; i <= 1000; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
