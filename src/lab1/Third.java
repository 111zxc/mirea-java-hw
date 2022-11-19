package lab1;
import java.util.Scanner;

/* Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается в цикле сумма
элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл do while,
также необходимо найти максимальный и минимальный элемент в массиве,
результат выводится на экран */

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.print("Введите размер массива: ");
        if (sc.hasNextInt()){
            n = sc.nextInt();
        }
        int[] array = new int[n];
        int sum = 0; int i = 0; int min = 0; int max = 0;
        do {
            System.out.print("Введите число: ");
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
                if(i == 0) { min = array[i]; max = array[i]; }
                sum += array[i];
                if(array[i] < min) { min = array[i]; }
                if(array[i] > max) { max = array[i]; }
            }
            i += 1;
        } while (i < n);
        System.out.println("Сумма членов целочисленного массива " + sum);
        System.out.println("Среднее арифметическое членов массива равно " + Double.valueOf(sum)/n);
        System.out.println("Максимальное значение равно " + max);
        System.out.println("Минимальное значение равно " + min);
    }
}
