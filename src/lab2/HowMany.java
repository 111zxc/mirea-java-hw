package lab2;
import java.util.Scanner;

/* Напишите программу HowMany.java, которая определит, сколько
слов Вы ввели с консоли */

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = line.length() - line.replace(" ", "").length();
        count += 1;
        System.out.println("Вы ввели " + count + " слов!");
    }
}
