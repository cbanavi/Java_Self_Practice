package day14_practice_tasks.car_task;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("BMW is starting.");
    }

    @Override
    public void drive() {
        System.out.println("BMW is driving.");
    }
}
