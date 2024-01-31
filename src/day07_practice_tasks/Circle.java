package day07_practice_tasks;

import java.util.Scanner;


public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        double circleArea = Math.PI * Math.pow(radius, 2);
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.println("The area of the Circle is " + circleArea);
        System.out.println("The perimeter of the Circle is " + circlePerimeter);

        input.close();

    }
}