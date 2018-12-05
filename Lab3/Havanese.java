public class Havanese extends Dog {
    Havanese (double w, double h)
    {
        weight = w;
        height = h;
    }
    Havanese ()
    {
        weight = 0;
        height = 0;
    }

    public void beCute()
    {
        System.out.println("Милая собачка");
    }

    public String toString()
    {
        return "Havanese{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

