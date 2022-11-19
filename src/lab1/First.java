package lab1;
import java.util.Scanner;

/* Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается в цикле сумма
элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл for */

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.print("Введите размер массива: ");
        if (sc.hasNextInt()){
            n = sc.nextInt();
        }
        int array[] = new int[n];
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            System.out.print("Введите число: ");
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
                sum += array[i];
            }
        }
        System.out.println("Сумма членов целочисленного массива " + sum);
        System.out.println("Среднее арифметическое членов массива равно " + (double) sum /n);
    }
}