import java.util.Arrays;

public class Triangle extends Shape
{
    private double[] sides;

    public Triangle()
    {
        super();
        this.sides = new double[] { 1.0, 1.0, 1.0 };
    }

    public Triangle(double sideA, double sideB, double sideC)
    {
        this(sideA, sideB, sideC, "red", true);
    }

    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled)
    {
        super(color, filled);
        this.sides = new double[] { sideA, sideB, sideC };
    }

    public Triangle(double[] sides) throws Exception
    {
        this(sides, "red", true);
    }

    public Triangle(double[] sides, String color, boolean filled) throws Exception
    {
        super(color, filled);
        if (sides.length < 3)
            throw new Exception("sides array must have 3 elements.");
        this.sides = sides;
    }

    public double getPerimeter()
    {
        double sum = 0.0;
        for (int i = 0; i < 3; i++)
        {
            sum += this.sides[i];
        }
        return sum;
    }

    // applying Heron's formula to get area
    public double getArea()
    {
        double s = this.getPerimeter() / 2.0;
        return Math.sqrt(s * (s - this.sides[0]) * (s - this.sides[1]) * (s - this.sides[2]));
    }

    public double[] getSides()
    {
        double[] copy = new double[3];
        System.arraycopy(sides, 0, copy, 0, 3);
        return copy;
    }

    public double getSideA()
    {
        return this.sides[0];
    }

    public double getSideB()
    {
        return this.sides[1];
    }

    public double getSideC()
    {
        return this.sides[2];
    }

    public void setSideA(double length)
    {
        this.sides[0] = length;
    }

    public void setSideB(double length)
    {
        this.sides[1] = length;
    }

    public void setSideC(double length)
    {
        this.sides[2] = length;
    }

    public void setSide(int sideNum, double length) throws Exception
    {
        if (sideNum < 0 || sideNum > 2)
            throw new Exception("sideNum must be between 0-2.");
        this.sides[sideNum] = length;
    }

    @Override
    public String toString()
    {
        return String.format("Triangle[%s, sides=%s, area=%.5f, perimeter=%.5f]", super.toString(),
            Arrays.toString(this.sides), this.getArea(), this.getPerimeter());
    }
}
