public class Demo {
    public static void main(String[] args) {
        System.out.println();
        Shape[] shapes = new Shape[4];

        // Creating different shapes
        shapes[0] = new Circle(7);
        shapes[1] = new Ellipse(6, 3);
        shapes[2] = new Triangle(3, 5, 7);
        shapes[3] = new EquilateralTriangle(6);


        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println();
    }

}
