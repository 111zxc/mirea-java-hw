package lab2;
import java.util.Scanner;
import java.util.Vector;

public class Tester {
    private static Vector<Circle> arr = new Vector<Circle>();
    private static int n = 0;

    public static void addItem(Circle a){
        arr.add(a);
        n += 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату по x: "); double x = sc.nextDouble();
        System.out.print("Введите координату по y: "); double y = sc.nextDouble();

        Point a = new Point(x, y);
        System.out.println(a.toString());

        System.out.print("Введите радиус: "); double r = sc.nextDouble();
        Circle b = new Circle(r, a);
//        System.out.println(b.toString());

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i).toString());
        }
    }
}
