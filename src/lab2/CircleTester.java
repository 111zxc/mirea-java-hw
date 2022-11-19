package lab2;
import java.util.Scanner;

/* Создать класс, описывающий модель окружности (Circle). В классе
должны быть описаны нужные свойства окружности и методы для получения и
22
изменения этих свойств. Добавить методы для расчета площади круга и длины
окружности, а также метод позволяющий сравнивать две окружности. При
помощи класса CircleTest, содержащего статический метод main(String[] args),
протестировать работу класcа Circle. */

public class CircleTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point sample = new Point(0, 0);
        System.out.print("Введите радиус окружности a: "); double r = sc.nextDouble();
        Circle a = new Circle(r, sample);
        System.out.println(a.toString());
        System.out.println("Площадь поверхности: " + a.area() + "; длина окружности: " + a.length());
        Circle b = new Circle(15, sample);
        System.out.println(b.toString());
        System.out.println(Circle.areEqual(a, b));
    }
}
