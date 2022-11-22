package lab3;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class RandomArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество элементов: "); int n = sc.nextInt();
        if(n <= 0){
            throw new Exception("Неверное количество элементов!");
        }
        double[] randomArray = new double[n];

        // Генерация используя Math.random()
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = Math.random();
        }

        // Вывод первого способа
        System.out.print("Первый способ: ");
        for(int i = 0; i < randomArray.length; i++){
            System.out.print(String.format("%.2f", randomArray[i]) + " ");
        }
        System.out.println("");

        // Генерация используя Math.random()
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextDouble();
        }

        // Вывод второго способа
        System.out.print("Второй способ: ");
        for(int i = 0; i < randomArray.length; i++){
            System.out.print(String.format("%.2f", randomArray[i]) + " ");
        }
    }
}
