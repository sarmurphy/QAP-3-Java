abstract class Shape {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for perimeter/area
    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return name + ": Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}