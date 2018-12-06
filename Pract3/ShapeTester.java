import java.util.Scanner;

public class ShapeTester 
{
    public static	void	main(String[]	args) 
   {
        Scanner in = new Scanner(System.in);
        Circle circle = new Circle("Красный", true, 4);
        System.out.print("КРУГ (circle)\n");

        System.out.print("Введите цвет:\n");
        circle.setColor(in.next());
        System.out.print("\n");

        System.out.print("Заливка :\n");
        circle.setFilled(in.nextBoolean());
        System.out.print("\n");

        System.out.print("Введите радиус:\n");
        circle.setRadius(in.nextDouble());
        System.out.print("\n");

        System.out.print("Площадь круга: \n");
        System.out.print(circle.getArea());
        System.out.print("\n");
        System.out.print("Периметр круга: \n");
        System.out.print(circle.getPerimeter());
        System.out.print("\n");

        System.out.print(circle);
        System.out.print("\n");
        System.out.print("\n");

        Rectangle rec = new Rectangle("Красный", true, 4, 3);
        System.out.print("Прямоугольник (rectangle)\n");

        System.out.print("Введите цвет:\n");
        rec.setColor(in.next());
        System.out.print("\n");

        System.out.print("Заливка :\n");
        rec.setFilled(in.nextBoolean());
        System.out.print("\n");

        System.out.print("Введите ширину:\n");
        rec.setWigth(in.nextDouble());
        System.out.print("\n");
        System.out.print("Введите длинну:\n");
        rec.setLength(in.nextDouble());
        System.out.print("\n");

        System.out.print("Площадь прямоугольника: \n");
        System.out.print(rec.getArea());
        System.out.print("\n");
        System.out.print("Периметр прямоугольника: \n");
        System.out.print(rec.getPerimeter());
        System.out.print("\n");

        System.out.print(rec);
        System.out.print("\n");
        System.out.print("\n");

        Square sq = new Square("Красный", true, 4);
        System.out.print("Квадрат (Square)\n");

        System.out.print("Введите цвет:\n");
        sq.setColor(in.next());
        System.out.print("\n");

        System.out.print("Заливка :\n");
        sq.setFilled(in.nextBoolean());
        System.out.print("\n");

        System.out.print("Введите сторону:\n");
        sq.setWigth(in.nextDouble());
        System.out.print("\n");

        System.out.print("Площадь квадрата: \n");
        System.out.print(sq.getArea());
        System.out.print("\n");
        System.out.print("Периметр квадрата: \n");
        System.out.print(sq.getPerimeter());
        System.out.print("\n");

        System.out.print(sq);

    }
}
