package lab1;

/* Написать программу, которая с помощью метода класса, вычисляет
факториал числа, проверить работу метода */

public class Factorial{
    public static int factorial(int num){
        if (num > 1) {
            return num * factorial(num - 1);
        } else return 1;
    }
}