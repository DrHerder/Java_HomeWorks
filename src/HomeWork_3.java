import java.util.Arrays;

public class HomeWork_3
{
    public static void main(String[] args)
    {
        //Для задания 1
        System.out.println("Задание 1:");
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(arr));
        changeNullandOne(arr);
        System.out.println(Arrays.toString(arr));

        //Для задания 2
        System.out.println("Задание 2:");
        int[] arr2 = new int[100];
        System.out.println(Arrays.toString(arr2));
        fillArray(arr2);
        System.out.println(Arrays.toString(arr2));

        //Для задания 3
        System.out.println("Задание 3:");
        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(arr3));
        multiplyByTwo(arr3);
        System.out.println(Arrays.toString(arr3));

        //Для задания 4
        System.out.println("Задание 4:");
        int[][] arr4 = new int[5][5];
        fillDiagonal(arr4);
        printSquare(arr4);

        //Для задания 5
        System.out.println("Задание 5:");
        int initialValue = 10;
        int len = 5;
        int[] arr5 = newArray(len, initialValue);
        System.out.println(Arrays.toString(arr5));

    }

    //Задание 1
    public static void changeNullandOne(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 1)
            {
                arr[i] = 0;
            }
            else
            {
                arr[i] = 1;
            }
        }
    }

    //Задание 2
    public static void fillArray(int[] arr2)
    {
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = (i + 1);
        }
    }

    //Задание 3
     public static void multiplyByTwo(int[] arr3)
     {
         for (int i = 0; i < arr3.length; i++)
         {
             if(arr3[i] < 6)
             {
                 arr3[i] = arr3[i] * 2;
             }
         }
     }

     //Задание 4
     public static void printSquare(int[][] arr4)
     {
         for (int i = 0; i < arr4.length; i++)
         {
             System.out.println(Arrays.toString(arr4[i]));
         }
     }
    public static void fillDiagonal(int[][] arr4)
    {
        for (int i = 0; i < arr4.length; i++)
        {
            arr4[i][i] = 1;
        }
    }

    //Задание 5
    public static int[] newArray(int len, int initialValue)
    {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++)
        {
            arr5[i] = initialValue;
        }
        return arr5;
    }

}
