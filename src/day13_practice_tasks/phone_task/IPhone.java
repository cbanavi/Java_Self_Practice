package day13_practice_tasks.phone_task;

public class IPhone extends Phone {
    public IPhone(String model, String size, double price, String color) {
        super("iPhone", model, size, price, color);
    }

    public void faceTime(int phoneNumber) {
        System.out.println("Facetiming with the number " + phoneNumber);
    }

}