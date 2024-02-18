package day14_practice_tasks;

import day14_practice_tasks.car_task.Audi;
import day14_practice_tasks.car_task.Car;
import day14_practice_tasks.car_task.Honda;
import day14_practice_tasks.car_task.Tesla;

public class CarShop {

    public static void main(String[] args) {

        double highestPrice = Double.MIN_VALUE;
        double lowestPrice = Double.MAX_VALUE;

        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue"),
        };

        for (Car each : cars) {
            if (each.getMake() == "Honda" && (each.getYear() >= 2010 && each.getYear() <= 2011)) {
                System.out.println(each.toString() + " is being recalled.");
            }

            if (each.getMake() == "Audi" && (each.getYear() >= 2015 && each.getYear() <= 2019)) {
                System.out.println(each.toString() + " is being recalled.");
            }

            if (each.getMake() == "Tesla" && (each.getYear() >= 2015 && each.getYear() <= 2016)) {
                System.out.println(each.toString() + " is being recalled.");
            }

            if (each.getPrice() > highestPrice) {
                highestPrice = each.getPrice();
            }

            if (each.getPrice() < lowestPrice) {
                lowestPrice = each.getPrice();
            }

        }

        System.out.println("-----------------------");

        for (Car each : cars) {
            if (each.getPrice() == highestPrice) {
                System.out.println(each.toString() + " is the most expensive car");
            }

            if (each.getPrice() == lowestPrice) {
                System.out.println(each.toString() + " is the cheapest car");
            }
        }

    }

}
/*

        1.2. Display all cars eligible for recall:
            - Honda: Years 2010 to 2011
            - Audi: Years 2015 to 2019
            - Tesla: Years 2015 to 2016
        1.3. Display the car with the highest price.
        1.4. Display the car with the lowest price.
        1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.

 */
