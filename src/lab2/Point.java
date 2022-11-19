package lab2;

/* 3.Создать класс точка Point, описывающий точку на плоскости */

public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return this.x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return this.y;
    }

    @Override
    public String toString(){
        return "Точка (" + String.format("%.2f", this.x) + "; " + String.format("%.2f", this.y) + ")";
    }
}
