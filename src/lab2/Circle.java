package lab2;
import java.lang.Math;

/* Создать Circle класс, в котором одно поле представляет точку
 – центр окружности, и добавить другие свойства */

public class Circle {
    private double radius;
    private Point center;

    Circle(double radius, Point center){
        this.radius = radius;
        this.center = center;

        Tester.addItem(this);
    }

    public static boolean areEqual(Circle a, Circle b){
        if(a.center.getY() != b.center.getY()) { return false; }
        if(a.center.getX() != b.center.getX()) { return false; }
        return a.radius == b.radius;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    public double length(){
        return 2 * Math.PI * this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void getCenter(){
        System.out.println(center.toString());
    }

    @Override
    public String toString(){
        return "Окружность радиуса " + this.radius + " с центром в (" + this.center.getX() + "; " + this.center.getY() + ")";
    }
}
