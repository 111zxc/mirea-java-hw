package lab2;

/* дополнительный класс для Shop */

public class Computer {
    private String name;
    private int price;

    Computer(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return name + ", цена: " + price;
    }
}
