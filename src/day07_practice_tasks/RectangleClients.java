package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.length = 15.6;
        rectangle1.width = 20.7;

        System.out.println("Area = " + rectangle1.calculateArea());
        System.out.println("Perimeter = " + rectangle1.calculatePerimeter());
        System.out.println(rectangle1);

        System.out.println();

        Rectangle rectangle2 = new Rectangle();

        rectangle2.length = 30.9;
        rectangle2.width = 30.7;

        System.out.println("Area = " + rectangle2.calculateArea());
        System.out.println("Perimeter = " + rectangle2.calculatePerimeter());
        System.out.println(rectangle2);

        System.out.println();

        Rectangle rectangle3 = new Rectangle();

        rectangle3.length = -10.3;
        rectangle3.width = 20.9;

        System.out.println("Area = " + rectangle3.calculateArea());
        System.out.println("Perimeter = " + rectangle3.calculatePerimeter());
        System.out.println(rectangle3);

        System.out.println();

    }

}