package day14_practice_tasks.car_task;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota Started");
    }

    @Override
    public void drive() {
        System.out.println("Toyota is driving");
            }
}
