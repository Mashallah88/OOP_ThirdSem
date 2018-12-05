public class Dog implements Nameable
{
    private double weight;
    private double height;
    private String name;


    Dog (double w, double h, String n)
    {
        weight = w;
        height = h;
        name = n;
    }
    Dog ()
    {
        weight = 0;
        height = 0;
    }

    public void setWeight(double w)
    {
        weight = w;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    @Override
    public String getName()
    {
        return name;
    }
    public double getWeight()
    {
        return weight;
    }
    public double getHeight()
    {
        return height;
    }


    public void bark()
    {
        System.out.println("Гав-гав-гав");
    }
    public void walk()
    {
        System.out.println("Собака отправилась на прогулку");
    }
    public void play()
    {
        System.out.println("Собака играет с мячиком");
    }
}
