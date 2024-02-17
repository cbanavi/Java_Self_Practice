package day14_practice_tasks.car_task;

public class Tesla extends Car implements AutoPark, AutoPilot {
    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla can auto park.");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla can self drive.");
    }

    @Override
    public void start() {
        System.out.println("Tesla can is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Tesla can driving.");
    }
}

/*
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */