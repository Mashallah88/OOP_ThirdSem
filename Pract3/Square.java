public class Square extends Rectangle 
{

    public Square()
  {
        this.color = "red";
        this.filled = false;
        this.wigth = 1;
        this.length = 2;
    }

    public Square(double side)
   {
        this.color = "red";
        this.filled = false;
        this.wigth = side;
    }

    public Square(String color, boolean filled, double side)
   {
        this.color = color;
        this.filled = filled;
        this.wigth = side;
    }

    public void setSide(double s)
   {
        this.wigth = s;
    }
    public double getSide()
   {
        return wigth;
    }

    @Override
    public double getArea()
   {
        return wigth*wigth;
    }

    @Override
    public double getPerimeter()
   {
        return wigth*4;
    }

    public String toString()
  {
        return "Shape: square, side: " +wigth+ ", color: " +color;
    }
}
