public class Dog
{
    protected double weight;
    protected double height;

    Dog (double w, double h)
    {
        weight = w;
        height = h;
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

    public void setHeight(double h)
    {
        height = h;
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

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
