package lab3;
import java.util.Random;

public class RandomFourArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[4];
        System.out.println("Случайно сгенерированный массив: ");
        for(int i = 0; i < 4; i++){
            arr[i] = random.nextInt(10, 99);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        boolean raising = true;
        for(int i = 1; i < 3; i++){
            if(arr[i+1] <= arr[i]) raising = false;
        }
        if(raising) System.out.println("Последовательность строго возрастающая!");
        else System.out.println("Последовательность НЕ строго возрастающая!");
    }
}
