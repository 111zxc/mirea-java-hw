package lab1;

/* Написать программу, в результате работы которой выводятся на экран
первые 10 чисел гармонического ряда (форматировать вывод) */

public class Fourth {
    public static void main(String[] args) {
        System.out.print("Первые десять чисел гармонического ряда: ");
        String result = "";
        for(double i = 1; i <= 10; i++) {
            String temp = String.format("%.2f", 1/i);
            result = result.concat(temp + " ");
        }
        System.out.println(result);
    }
}
