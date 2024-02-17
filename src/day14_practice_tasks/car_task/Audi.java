package day14_practice_tasks.car_task;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Audi is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Audi is driving.");
    }

    @Override
    public void autoPark() {
        System.out.println("Audi can auto park.");
    }
}

/*
8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
 */