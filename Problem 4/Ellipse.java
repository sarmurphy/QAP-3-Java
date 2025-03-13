public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    // Constructor
    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    // Method to get the area
    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    // Method to get the perimeter
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }

    // Scale method to adjust axes
    @Override
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }

    // toString method
    @Override
    public String toString() {
        return "Ellipse with a major axis of: " + majorAxis + " and a minor axis of: " + minorAxis;
    }
}
