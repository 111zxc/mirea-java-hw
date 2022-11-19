package lab2;

/* По диаграмме класса UML описывающей сущность Автор.
Необходимо написать программу, которая состоит из двух классов Author и
TestAuthor. Класс Author должен содержать реализацию методов,
представленных на диаграмме класса на рисунке 2.4 */

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }
    @Override
    public String toString(){
        return "Author " + this.name + ", email: " + this.email + ", gender: " + this.gender;
    }
}
