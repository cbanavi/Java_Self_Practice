package day07_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Items items1 = new Items();

        items1.setInfo("Apple", 1.25, 5);
        System.out.println("The total cost is: " + items1.calcCost());
        System.out.println(items1.toString());
        System.out.println();

        Items items2 = new Items();

        items2.setInfo("Coffee", 5.99, 2);
        System.out.println("The total cost is: " + items2.calcCost());
        System.out.println(items2.toString());
        System.out.println();

        Items items3 = new Items();
        items3.setInfo("orange", 2.30, 7);
        System.out.println("The total cost is: " + items3.calcCost());
        System.out.println(items3.toString());
        System.out.println();
    }

}