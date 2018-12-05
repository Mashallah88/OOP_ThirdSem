import java.lang.System;
import java.util.Random;
import java.util.Scanner;
public class Cycles
{
    public static void main(String[] args)
    {
        //Массив длинной с случайной длинной не более 10 элементов
        int count = (int) (Math.random() * 10 + 1);
        int arr[] = new int[count];

        //Заполнение массива числами [-1000; 1000]
        /*for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 1000 - Math.random() * 1000);
        }*/

        //Значения задаются случайным образом
       final Random random = new Random();
        for (int i = 0; i< arr.length; i++)
        {
            arr[i] = random.nextInt();
        }

       /*
       С помощью клавиатуры
       final Scanner sc = new Scanner(System.in);
       for (int i = 0; i < arr.length; i++)
       {
           arr[i] = sc.nextInt();
       }
       */

        //Вывод первоначального массива
        System.out.println("Origin array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        //Сортировка методом пузырька
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
            {
                int m;
                if (arr[j] > arr[j + 1])
                {
                    m = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = m;
                }
            }

        //Вывод отсоритрованного массива
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
