public class Demo {
    public static void scaleShapes(Scalable[] shapes, double factor) {
        System.out.println("Shapes before scaling: ");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        for (Scalable shape : shapes) {
            shape.scale(factor);
        }

        System.out.println("Shapes after scaling: ");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        Scalable[] shapes = {
            new Circle(7),
            new Ellipse(6, 3),
            new Triangle(3, 5 ,7),
            new EquilateralTriangle(6)
        };

        // Scaling shapes by a factor of 4
        scaleShapes(shapes, 2);
    }
}