public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    // Constructor
    public Ellipse(double a, double b) {
        super("Ellipse");
        this.majorAxis = Math.max(a, b);
        this.minorAxis = Math.min(a, b);
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * (Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2));
    }
}
