package lab2;
import java.util.Scanner;

/* По UML диаграмме класса, представленной на рис. 2.5 написать
программу, которая состоит из двух классов. Один из них Ball должен
реализовывать сущность мяч, а другой с названием TestBall тестировать работу
созданного класса. Класс Ball должен содержать реализацию методов,
представленных на UML. Диаграмма на рисунке описывает сущность Мяч
написать программу. Класс Ball моделирует движущийся мяч */

public class TestBall {
    public static void main(String[] args) {
        Ball a = new Ball();
        System.out.println(a.toString());

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: "); double x = sc.nextDouble();
        System.out.print("Введите y: "); double y = sc.nextDouble();
        Ball b = new Ball(x, y);

        System.out.println(b.toString());

        System.out.print("Введите разницу по x: "); x = sc.nextDouble();
        System.out.print("Введите разницу по y: "); y = sc.nextDouble();
        b.move(x, y); System.out.println(b.toString());
    }
}
