package day12_practice_tasks;

public class Circle {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("The radius cannot be set to a negative or zero value");
        }
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}