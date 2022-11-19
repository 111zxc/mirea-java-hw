package lab2;

/* Разработайте и реализуйте класс Dog (Собака), поля класса
описывают кличку и возраст собаки. Необходимо выполнить следующие
действия: определить конструктор собаки, чтобы принять и инициализировать
данные экземпляра., включить стандартные методы (аксессоры) для получения
и установки для имени и возраста, включить метод для перевода возраста
собаки в “человеческий” возраст (возраст семь раз собаки), включите метод
ToString, который возвращает описание экземпляра собаки в виде строки.
Создание класса тестера под названием ПитомникСобак, реализует массив
собак и основной метод этого класса позволяет добавить в него несколько
объектов собаки
 */

public class Dog {
    private String name;
    private int age;

    Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    // Возвращает в "человеческих" годах
    public int getHumanAge(){
        return this.age * 7;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Собака " + this.name + ", возраст: " + this.age;
    }
}
