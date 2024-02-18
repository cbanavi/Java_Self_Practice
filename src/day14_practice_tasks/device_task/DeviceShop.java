package day14_practice_tasks.device_task;

public class DeviceShop {

    public static void main(String[] args) {

        Desktop desktop = new Desktop("HP", "Envy", 499.99, "Black", "20 in x 10 in", false, true);
        PersonalComputer PC = new PersonalComputer("Omen", "25L Gaming", 1199.99, "White", "24 in x 8 in", false, true);
        Google google = new Google("Pixel 8", 799.99, "Black", "6.2 inches", true, true, 1234567890);
        IPhone iPhone = new IPhone("Pro Max 15", 999.99, "Titanium", "6.5 inches", true, true, 1236540987);
        Samsung samsung = new Samsung("S21", 899.99, "Red", "6 inches", true, false, 1230987654);

        System.out.println(desktop);
        System.out.println(PC);
        System.out.println(google);
        System.out.println(iPhone);
        System.out.println(samsung);

        desktop.turnOn();
        desktop.turnOff();

        google.call();
        google.text();
        google.downloadApp();

        iPhone.call();
        iPhone.text();
        iPhone.downloadApp();

        samsung.call();
        samsung.text();
        samsung.downloadApp();

    }

}
