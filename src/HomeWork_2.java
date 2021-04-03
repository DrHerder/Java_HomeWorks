public class HomeWork_2
{
    public static void main (String[] args)
        {
            //Для задания 1 и 2
            int a = -5;
            int b = 15;
            boolean result10and20 = within10and20(a, b);
            System.out.println(result10and20);
            isPositiveOrNegative(a);
            //Для задания 3
            boolean resultNegative = isNegative(a);
            System.out.println(resultNegative);
            //Для задания 4
            int times = 3;
            String word = "Напечатать строку " + times + " раз(а)";
            printWordNTimes(word, times);
        }

    //Задание 1
        public static boolean within10and20(int a, int b)
        {
            int sum = a + b;
            return 10 <= sum && sum <= 20;
        }

    //Задание 2
        public static void isPositiveOrNegative (int a)
        {
            if (a > 0)
            {
                System.out.println("Положительное число");
            }
            else
                {
                    System.out.println("Отрицательное число");
                }
        }

    //Задание 3
        public static boolean isNegative(int a)
        {
            return a < 0;
        }

    //Задание 4
        public static void printWordNTimes (String word, int times)
        {
            for (int i = 0; i < times; i++)
            {
                System.out.println(word);
            }
        }

}
