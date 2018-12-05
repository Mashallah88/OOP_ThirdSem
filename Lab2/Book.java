public class Book {
    private String author; //Автор
    private String name; // Название
    private int year; // Год выпуска
    private int pages; // Количество страниц

    //Конструкторы
    Book (String a, String n, int y, int p){
        author = a;
        name = n;
        year = y;
        pages = p;
    }

    Book (){
        author = "NoName";
        name = "NoName";
        year = 0;
        pages = 0;
    }

    //Возращение полей
    public String getAuthor()
    {
        return author;
    }
    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
    public int getPages(){
        return pages;
    }

    //Установка полей
    public void setAuthor(String a)
    {
        author = a;
    }

    public void setName(String n)
    {
        name = n;
    }
    public void setYear(int y)
    {
        year = y;
    }
    public void setPages(int p)
    {
        pages = p;
    }

    //Вывод объекта
    public String toString()
    {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }

    public void bInfo()
    {
        System.out.println("Автор: " + author);
        System.out.println("Название произведения: " + name);
        System.out.println("Год выпуска: " + year);
        System.out.println("Количество страниц: " + pages);
    }

}
