package day14_practice_tasks.car_task;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Mercedes is starting");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes is driving");
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes can auto park");
    }
}
