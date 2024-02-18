package day14_practice_tasks.device_task;

public abstract class Phone extends Device {

    private long phoneNumber;

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
        this.phoneNumber = phoneNumber;
    }

    public void call() {
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNumber);
    }

    public void text() {
        System.out.println(getBrand() + " " + getModel() + " is texting " + phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
