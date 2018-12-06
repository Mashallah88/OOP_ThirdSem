import java.util.Scanner;

public class FivePrac 
{
    public static int sequence(int n, int step) 
    {

        if (step > n) 
      {
            return 1;
        }
        System.out.print(step+ " ");
        return sequence(n, step+1);
    }

    public static void main(String[] args)
  {

        Scanner in = new Scanner(System.in);

        int number;
        int step = 1;
        System.out.print("Введите число:\n");
        number = in.nextInt();
        System.out.print("\n");
        System.out.print("Итоговая последовательность: \n");
        sequence(number, step);  //Вызов рекурсивной функции


    }
}
