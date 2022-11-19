package lab2;
import java.util.Scanner;
import java.util.Vector;

/* Тестер для Dog.java */

public class DogTester {
    private static Vector<Dog> dogs = new Vector<Dog>();
    public static void addDog(Dog a){
        dogs.add(a);
    }
    public static void displayDogs(){
        for (Dog dog: dogs){
            System.out.println(dog.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество собак: "); int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Введите кличку собаки: "); String name = sc.next();
            System.out.print("Введите возраст собаки: "); int age = sc.nextInt();
            Dog a = new Dog(name, age);
            DogTester.addDog(a);
        }
        DogTester.displayDogs();
    }
}
