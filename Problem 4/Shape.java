public abstract class Shape implements Scalable {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for perimeter and area
    public abstract double getArea();
    public abstract double getPerimeter();

    // toString method
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
