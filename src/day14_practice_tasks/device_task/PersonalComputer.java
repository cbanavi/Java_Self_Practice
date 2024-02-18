package day14_practice_tasks.device_task;

public class PersonalComputer extends Computer{

    public PersonalComputer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is turning off.");
    }
}
