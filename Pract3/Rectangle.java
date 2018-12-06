public class Rectangle extends Shape 
{
    protected double wigth;
    protected double length;

    public Rectangle()
  {
        this.color = "red";
        this.filled = false;
        this.wigth = 1;
        this.length = 2;
    }

    public Rectangle(double wigth, double length)
  {
        this.color = "red";
        this.filled = false;
        this.wigth = wigth;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double wigth, double length)
  {
        this.color = color;
        this.filled = filled;
        this.wigth = wigth;
        this.length = length;
    }

    public void setWigth(double w)
   {
        this.wigth = w;
    }
    public double getWigth()
   {
        return wigth;
    }

    public void setLength(double l)
   {
        this.length = l;
    }
    public double getLength()
   {
        return length;
    }

    public double getArea()
   {
        return wigth*length;
    }

    public double getPerimeter()
   {
        return 2*wigth+2*length;
    }

    public String toString()
   {
        return "Shape: rectangle, wigth: " +wigth+ ", length: " +length+ ", color: " +color;
    }
}
