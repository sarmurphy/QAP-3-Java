public class Demo {
    public static void main(String[] args) {
        System.out.println();
        // Creating a new movable point
        MovablePoint movablePoint = new MovablePoint(2.0f, 3.5f, 1.0f, 2.5f);
        System.out.println("Point before moving: " + movablePoint);

        // Moving the point
        movablePoint.move();
        System.out.println();
        System.out.println("Point after moving: " + movablePoint);

        // Update of xSpeed and ySpeed, moving point again
        movablePoint.setSpeed(1.5f, 2.5f);
        movablePoint.move();
        System.out.println();
        System.out.println("Point after moving again, and updating speed: " + movablePoint);
    }
}
