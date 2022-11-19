package lab1;
import java.util.Scanner;

/* Написать программу, которая с помощью метода класса, вычисляет
факториал числа, проверить работу метода */

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: "); int i = sc.nextInt();
        System.out.println("Фактор для числа " + i + " равен " + Factorial.factorial(i));
    }
}
