public class Cylinder extends Circle
{ // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder()
    {
        // TO DO: // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height)
    {
        // TO DO: // call superclass no-arg constructor Circle()
        super();
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height)
    {
        // TO DO: // call superclass constructor Circle(r)
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color, boolean filled)
    {
        super(radius, color, filled);
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume()
    {
        // TO DO:
        return super.getArea() * this.height;
    }

    // TO DO: toString() method to the Cylinder class, which
    // overrides the toString() inherited from the superclass Circle
    @Override
    public String toString()
    {
        return String.format("Cylinder[height=%.5f,radius=%.5f,color=%s]", this.height, super.getRadius(),
            super.getColor());
    }
}
