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

/*

Employee employee1 = new Employee();

        employee1.name = "Chiyavan Banavi";
        employee1.age = 26;
        employee1.gender = 'M';
        employee1.jobTitle = "SDET";
        employee1.salary = 120_000;

        employee1.work();
        System.out.println(employee1);

        System.out.println();

2. Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.

 */