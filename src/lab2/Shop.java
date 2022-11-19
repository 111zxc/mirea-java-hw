package lab2;
import java.util.Objects;
import java.util.Vector;

/* Разработайте класс Shop для, реализуйте методы добавления и
удаления компьютеров в магазине, добавьте метод поиска в магазине
компьютера, нужного пользователю. Протестируйте работу созданных классов.
Данные для заполнения массива компьютеров вводятся с клавиатуры
пользователем */

public class Shop {
    private static Vector<Computer> items = new Vector<Computer>();

    public static void addItem(Computer a){
        items.add(a);
    }

    public static void displayItems(){
        System.out.println("Компьютеры: ");
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i).toString());
        }
    }

    public static void search(String name){ // Поиск компьютера по названию
        boolean found = false;
        for (Computer item : items) {
            if (!found) {
                if (Objects.equals(item.getName(), name)) {
                    System.out.println("Компьютер найден!");
                    System.out.println(item.toString());
                    found = true;
                }
            }
        }
        if(!found) { System.out.println("Компьютера не существует!"); }
    }
}
