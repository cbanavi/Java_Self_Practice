package day14_practice_tasks.car_task;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {

    public CydeoCar(String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println("CydeoCar can self drive.");
    }

    @Override
    public void fly() {
        System.out.println("CydeoCar can fly.");
    }

    @Override
    public void autoPark() {
        System.out.println("CydeoCar can auto park.");
    }

    @Override
    public void start() {
        System.out.println("CydeoCar is starting.");
    }

    @Override
    public void drive() {
        System.out.println("CydeoCar is driving.");
    }


}

/*
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.

 */