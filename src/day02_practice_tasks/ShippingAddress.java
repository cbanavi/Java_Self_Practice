package day02_practice_tasks;

public class ShippingAddress {

    public static void main(String[] args) {

        String fullName = "Aaron Kissinger";
        int buildingNumber = 13621;
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        int zipCode = 22030;

        System.out.println("Your Shipping address is:");
        System.out.println("\t\t\t\t" + fullName);
        System.out.println("\t\t\t\t" + buildingNumber + " " + streetName);
        System.out.println("\t\t\t\t" + city + ", " + state + " " + zipCode);

    }
}
