package day07_practice_tasks;

public class Rectangle {
    public double width;
    public double length;


    public double calculateArea(){

        double rectangleArea = width * length;
        return rectangleArea;
    }

    public double calculatePerimeter(){

        double rectanglePerimeter = (2 * width) + (2 * length);
        return rectanglePerimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}