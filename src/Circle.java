/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle extends Shape
{ // Save as "Circle.java"
  // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle()
    {
        super();
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius)
    { // 2nd constructor
        super();
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    /** Returns the radius */
    public double getRadius()
    {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter()
    {
        return 2.0 * Math.PI * this.radius;
    }

    @Override
    public String toString()
    {
        return String.format("Circle[%s,radius=%.5f]", super.toString(), this.radius);
    }
}