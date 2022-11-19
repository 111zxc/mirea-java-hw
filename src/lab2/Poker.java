package lab2;
import java.util.Scanner;
import java.util.Random;

/* Напишите программу Poker.java, которая должна имитировать
раздачу карт для игры в покер. Программа получает число n, задаваемое с
консоли пользователем, и раздает карты на n игроков (по 5 карт каждому) из
перетасованной колоды. Разделяйте пять карт, выданных каждому игроку,
пустой строкой. */

public class Poker {
    public static void main(String[] args) {
        Random randomGen = new Random();

        String[] suits = {"s", "c", "h", "d"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        String[] cards = new String[52];

        Scanner sc = new Scanner(System.in);

        // Генерация массива карт
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                cards[13*i + j] = ranks[j] + suits[i];
            }
        }

        // Шаффл колоды карт
        for (int i = 0; i < cards.length; i++) {
            int randomIndexToSwap = randomGen.nextInt(cards.length);
            String temp = cards[randomIndexToSwap];
            cards[randomIndexToSwap] = cards[i];
            cards[i] = temp;
        }

        System.out.print("Введите количество игроков: "); int n = sc.nextInt();
        if(n > 5) { System.out.println("Неверное количество игроков! N установлено 5."); n = 5; }

        // Раздача карт
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(cards[i*5 + j] + " ");
            }
            System.out.print("\n\n");
        }

    }
}
