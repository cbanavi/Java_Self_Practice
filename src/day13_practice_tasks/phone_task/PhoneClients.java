package day13_practice_tasks.phone_task;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Iphone 15", "6.5 inches", 999.99, "Black");
        Samsung samsung = new Samsung("S20", "6.2 inches", 899.99, "Blue");
        Nokia nokia = new Nokia( "Brick", "5.9 inches", 699.99, "Purple");

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);

        nokia.call(1092837456);
        samsung.text(1009003000);
        iPhone.faceTime(1234567890);

    }
}