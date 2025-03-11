public class Point {
    private float x;
    private float y;

    // Constructors
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Getting both X and Y
    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Setting both X and Y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}