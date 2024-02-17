package day14_practice_tasks.car_task;

public class Nio extends Car implements AutoPark, AutoPilot{
    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Nio can auto park.");
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio can self drive.");
    }

    @Override
    public void start() {
        System.out.println("Nio can is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Nio can driving.");
    }
}

/*
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */