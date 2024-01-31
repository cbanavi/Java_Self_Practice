package day07_practice_tasks;

public class AddressClients {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.getInfo(1234, "Main St", "El Cajon", "CA", "92020");

        System.out.println(address1.toString() + "\n");

        Address address2 = new Address();
        address2.getInfo(5678, "2nd St", "Lemon Grove", "CA", "91945");

        System.out.println(address2.toString());

    }
}