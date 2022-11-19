package lab2;

import java.util.Scanner;
import java.util.Vector;

/* Создать класс, описывающий книгу (Book). В классе должны быть
описаны нужные свойства книги (автор, название, год написания и т. д.) и
методы для получения, изменения этих свойств. Протестировать работу класса
в классе BookTest, содержащим метод статический main(String[] args). Написать методы класса,
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

    public static void sortShelf(){
        for(int i = 0; i < items.size(); i++){
            for (int j = 0; j < items.size()-i-1; j++){
                if (items.get(j).getPublishYear() > items.get(j+1).getPublishYear()){
                    Book temp = items.get(j);
                    items.set(j, items.get(j+1));
                    items.set(j+1, temp);
                }
            }
        }
        System.out.println("Результат сортировки: ");
        BookTest.displayItems();
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

        System.out.println("Самая новая книга - " + getNewest().toString());
        System.out.println("Самая старая книга - " + getOldest().toString());

        BookTest.sortShelf();
    }
}
