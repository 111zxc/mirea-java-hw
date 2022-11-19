package lab2;

/*  Напишите программу, которая меняет местами элементы
одномерного массива из String в обратном порядке. Не используйте
дополнительный массив для хранения результатов.  */

public class ReverseArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String a: cars){
            System.out.print(a + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < cars.length / 2; i++) {
            String temp = cars[i];
            cars[i] = cars[cars.length - 1 - i];
            cars[cars.length - 1 - i] = temp;
        }
        for(String a: cars){
            System.out.print(a + " ");
        }
        System.out.print("\n");
    }
}
