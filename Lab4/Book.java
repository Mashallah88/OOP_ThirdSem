public class Book implements Nameable
{
    private String author;
    protected String name;
    private int year;
    private int pages;

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

    public String getAuthor()
    {
        return author;
    }
    @Override
    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
    public int getPages()
    {
        return pages;
    }


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

    public void bInfo(){
        System.out.println("Автор: " + author);
        System.out.println("Название произведения: " + name);
        System.out.println("Год выпуска: " + year);
        System.out.println("Количество страниц: " + pages);
    }


}
