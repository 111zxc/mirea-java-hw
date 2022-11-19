package lab2;

/* Создать класс, описывающий книгу (Book). В классе должны быть
описаны нужные свойства книги (автор, название, год написания и т. д.) и
методы для получения, изменения этих свойств. Протестировать работу класса
в классе BookTest, содержащим метод статический main(String[] args). Создать
класс книжная полка, в котором поля данных класса это массив объектов типа
книги (Book, и количество книг на книжной полке. Написать методы класса,
которые возвращают книги с самым поздним и самым ранним сроком издания.
Написать метод класса, позволяющий расставить книги на книжной полке в
порядке возрастания года выпуска. */

public class Book {
    private String title, author;
    private int publishYear, pages;

    public Book() {
        title = "Default Title Book";
        author = "No Name";
        publishYear = 0;
        pages = 0;
    }

    public Book(String title, String author, int publishYear, int pages) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Книга " + this.title + ". Автор: " + this.author;
    }
}
