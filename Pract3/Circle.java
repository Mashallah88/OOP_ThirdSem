public class Circle extends Shape 
{
    private double radius;

    public Circle()
  {
        this.color = "red";
        this.filled = false;
        this.radius = 1;
    }

    public Circle(double radius)
  {
        this.color = "red";
        this.filled = false;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius)
   {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public void setRadius(double r)
   {
        this.radius = r;
    }
    public double getRadius()
   {
        return radius;
    }

    @Override
    public double getArea()
   {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter()
   {
        return Math.PI*radius;
    }

    @Override
    public String toString()
   {
        return "Shape: circle, radius: " +this.radius+ ", color: " +this.color;
    }
}
