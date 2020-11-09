
public class Square extends Rectangle
{
    public Square()
    {
        super();
    }
    
    public Square(double side)
    {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }
    
    public double getSide()
    {
        return super.getLength();
    }
    
    public void setSide(double side)
    {
        this.setLength(side);
        this.setWidth(side);
    }
    
    @Override
    public String toString()
    {
        return String.format("Square[%s]", super.toString());
    }
}
