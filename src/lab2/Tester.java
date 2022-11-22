package lab2;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Math;

public class Tester {
    private static Vector<Circle> arr = new Vector<Circle>();

    public static void displayCircles(){
        for (Circle c: arr){
            System.out.println(c.toString());
        }
    }
    private static int n = 0;
    public static void SmallestCircle(){
        Circle min_circle = arr.get(0);
        for(Circle c : arr){
            if (c.getRadius() < min_circle.getRadius()){
                min_circle = c;
            }
        }
        System.out.println("Самая маленькая окружность: " + min_circle.toString());
    }
    public static void BiggestCircle(){
        Circle max_circle = arr.get(0);
        for(Circle c : arr){
            if (c.getRadius() > max_circle.getRadius()){
                max_circle = c;
            }
        }
        System.out.println("Самая маленькая окружность: " + max_circle.toString());
    }

    public static void sortCirles(){
        for(int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.size()-i-1; j++){
                if (arr.get(j).getRadius() > arr.get(j+1).getRadius()){
                    Circle temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
        System.out.println("Результат сортировки: ");
        Tester.displayCircles();
    }

    public static void addItem(Circle a){
        arr.add(a);
        n += 1;
    }


    public static void main(String[] args) {
        Point p = new Point(0,0);


        for(int i = 0; i < 3; i++){
            double input_radius = Math.random();
            Circle new_circle = new Circle(input_radius, p);
            System.out.println(new_circle.toString());
        }

        Tester.BiggestCircle();
        Tester.SmallestCircle();
        Tester.sortCirles();

    }
}
