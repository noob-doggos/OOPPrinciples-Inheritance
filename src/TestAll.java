import java.util.Arrays;

public class TestAll
{
    public static void main(String[] args)
    {
        System.out.println("Initializing Shape class...");
        Shape shape = new Shape();
        shape.setColor("green");
        shape.setFilled(false);
        System.out.println("Shape is filled: " + shape.isFilled());
        System.out.println("Shape color: " + shape.getColor());
        System.out.println("Shape toString: " + shape.toString());
        
        System.out.println();
        
        System.out.println("Initializing Circle class...");
        Circle circle = new Circle(5.0);
        circle.setColor("pink");
        circle.setFilled(true);
        System.out.println("Circle is filled: " + circle.isFilled());
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle circumference: " + circle.getPerimeter());
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle toString: " + circle.toString());

        System.out.println();
        
        System.out.println("Initializing Cylinder class...");
        Cylinder cylinder = new Cylinder(5.0, 6.0);
        cylinder.setColor("blue");
        cylinder.setRadius(3.0);
        System.out.println("Cylinder is filled: " + cylinder.isFilled());
        System.out.println("Cylinder color: " + cylinder.getColor());
        System.out.println("Cylinder area: " + cylinder.getArea());
        System.out.println("Cylinder circumference: " + cylinder.getPerimeter());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder toString: " + cylinder.toString());
        
        System.out.println();
        
        System.out.println("Initializing Rectangle class...");
        Rectangle rectangle = new Rectangle(4.0, 5.0, "yellow", true);
        System.out.println("Rectangle is filled: " + rectangle.isFilled());
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle length: " + rectangle.getLength() + " width: " + rectangle.getWidth());
        System.out.println("Rectangle toString: " + rectangle.toString());
        
        System.out.println();
        
        System.out.println("Initializing Square class...");
        Square square = new Square(420.0, "green", true);
        System.out.println("Square is filled: " + square.isFilled());
        System.out.println("Square color: " + square.getColor());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Square length: " + square.getLength() + " width: " + square.getWidth());
        System.out.println("Square toString: " + square.toString());
        
        System.out.println();
        
        System.out.println("Initializing Triangle class...");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle is filled: " + triangle.isFilled());
        System.out.println("Triangle color: " + triangle.getColor());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle sides: " + Arrays.toString(triangle.getSides()));
        System.out.println("Triangle toString: " + triangle.toString());
    }
}
