import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        //Установка через конструктор
        Book first_book = new Book ("А.С. Пушкин", "Евгений Онегин", 1833, 239);

        int pages = first_book.getPages();
        if (pages < 300)
            System.out.println("В этой книге меньше трехсот страниц");
        else
            System.out.println("В этой книге больше трехсот страниц");

        //Вывод чрез метод
        first_book.bInfo();

        System.out.println("Введите новое количество страниц");
        final Scanner in = new Scanner(System.in);
        first_book.setPages(in.nextInt());

        //Вывод через метод
        first_book.bInfo();

        Book second_book = new Book();
        second_book.bInfo();

        //Вывод через system
        System.out.println(first_book);
        in.close();
    }
}
