public class Circle {

    // Attributes
    private double radius;
    private final double PI = 3.14159;

    // Constructor
    public Circle(double rad) {
        radius = rad;
    }

    public Circle() {
        radius = 0;
    }

    // Mutator
    public void setRadius(double rad) {
        radius = rad;
    }

    // Accessor
    public double getRadius() {
        return radius;
    }

    // Returns area of the circle
    public double getArea() {
        return PI * radius * radius;
    }

    // Returns diameter of the circle
    public double getDiameter() {
        return radius * 2;
    }

    // Returns circumfrence of the circle
    public double getCircumfrence() {
        return 2 * PI * radius;
    }
}
