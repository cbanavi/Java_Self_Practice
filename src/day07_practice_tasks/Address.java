package day07_practice_tasks;

public class Address {

    public int buildingNumber;
    public String street, city, state, zipCode;

    public void getInfo(int buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" +
                city + " " + state + ", " + zipCode;
    }
}