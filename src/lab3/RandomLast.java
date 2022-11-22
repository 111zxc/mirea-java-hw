package lab3;
import java.util.Random;
import java.util.Scanner;

public class RandomLast {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int n = 1; boolean correct = false;
        while(!correct){
            System.out.print("Введите n: "); n = sc.nextInt();
            if(n > 0) correct = true;
        }

        int[] arr = new int[n];
        System.out.println("Сгенерированный массив: ");
        for(int i = 0; i < n; i++) {
            arr[i] = random.nextInt(0, n);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        System.out.println("Чётные числа: ");
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
