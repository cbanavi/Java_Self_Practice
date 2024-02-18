package day14_practice_tasks.device_task;

public class Google extends Phone implements Downloadable, AndroidApps{

    public Google(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super("Google", model, price, color, size, hasBattery, hasPowerButton, phoneNumber);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is turning off.");

    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " is downloading an app from " + AppStoreName + " on " + OS);
    }

}
