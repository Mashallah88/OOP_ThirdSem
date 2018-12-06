public abstract class Shape 
  {
    protected String color;
    protected boolean filled;

    Shape()
  {
        this.color = "non";
        this.filled = false;
    }

    Shape(String color, boolean filled)
   {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String c)
   {
        this.color = c;
    }
    public String getColor()
   {
        return color;
    }

    public void setFilled(boolean f)
   {
        this.filled = f;
    }
    public boolean isFilled()
   {
        return filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
