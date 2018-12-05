public class Dachshund extends Dog
{
    private double length;
    Dachshund (double w, double h, double l)
    {
        weight = w;
        height = h;
        length = l;
    }

    Dachshund ()
    {
        weight = 0;
        height = 0;
        length = 0;
    }

    public void setLength(double l)
    {
        length = l;
    }

    public double getLength()
    {
        return length;
    }

    public void fox()
    {
        System.out.println("Такса охотится на лис");
    }

    @Override
    public String toString()
    {
        return "Dachshund{" +
                "length=" + length +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
