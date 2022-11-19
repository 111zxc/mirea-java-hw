package lab2;
import java.util.Scanner;

/* Разработайте класс Shop для, реализуйте методы добавления и
удаления компьютеров в магазине, добавьте метод поиска в магазине
компьютера, нужного пользователю. Протестируйте работу созданных классов.
Данные для заполнения массива компьютеров вводятся с клавиатуры пользователем */

public class ShopTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: "); int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Введите название: "); String name = sc.next();
            System.out.print("Введите цену: "); int price = sc.nextInt();
            Computer a = new Computer(name, price);
            Shop.addItem(a);
        }

        Shop.displayItems();

        System.out.print("Введите искомое название: "); String name = sc.next();
        Shop.search(name);
    }
}
