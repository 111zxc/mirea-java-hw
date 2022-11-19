package lab2;

import java.util.Scanner;
import java.util.Vector;

/* Создать класс, описывающий книгу (Book). В классе должны быть
описаны нужные свойства книги (автор, название, год написания и т. д.) и
методы для получения, изменения этих свойств. Протестировать работу класса
в классе BookTest, содержащим метод статический main(String[] args). Создать
класс книжная полка, в котором поля данных класса это массив объектов типа
книги (Book, и количество книг на книжной полке. Написать методы класса,
которые возвращают книги с самым поздним и самым ранним сроком издания. */

public class BookTest {
    private static Vector<Book> items = new Vector<Book>();

    public static void displayItems() {
        System.out.println("Книги: ");
        for (Book book : items) {
            System.out.println(book.toString());
        }
    }

    public static Book getNewest() {
        Book newest = items.get(0);
        for (Book book : items) {
            if (book.getPublishYear() > newest.getPublishYear()) {
                newest = book;
            }
        }
        return newest;
    }

    public static Book getOldest() {
        Book oldest = items.get(0);
        for (Book book : items) {
            if (book.getPublishYear() < oldest.getPublishYear()) {
                oldest = book;
            }
        }
        return oldest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество книг: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите название: ");
            String name = sc.next();
            System.out.print("Введите год публикации: ");
            int age = sc.nextInt();
            Book a = new Book(name, "Sample Author", age, 123);
            BookTest.items.add(a);
        }
        BookTest.displayItems();
        System.out.println(getNewest().toString());
        System.out.println(getOldest().toString());
    }
}
