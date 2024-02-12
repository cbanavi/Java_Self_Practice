package day12_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item apple = new Item("Apple", 3.5, 2);
        Item banana = new Item("Banana", 2.5, 5);


        System.out.println(apple + "\n" + apple.calcCost());
        System.out.println(banana + "\n" + banana.calcCost());

    }

}