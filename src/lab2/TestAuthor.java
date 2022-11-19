package lab2;
import java.util.Scanner;

/* По диаграмме класса UML описывающей сущность Автор.
Необходимо написать программу, которая состоит из двух классов Author и
TestAuthor. Класс Author должен содержать реализацию методов,
представленных на диаграмме класса на рисунке 2.4 */

public class TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        String name = sc.nextLine();
        System.out.print("Введите email автора: ");
        String email = sc.nextLine();
        System.out.print("Введите гендер автора: ");
        char gender = sc.next().charAt(0);

        Author author = new Author(name, email, gender);
        System.out.println(author.toString());

        System.out.println("Email автора изменен на 123@456.com!");
        author.setEmail("123@456.com");
//        System.out.println(author.getEmail());
        System.out.println(author.toString());
    }
}
