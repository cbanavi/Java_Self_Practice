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

/*
3. Create a custom class named Item with the following attributes and actions:

      Attributes:
            itemName (String): used for storing the name of the item.
            unitPrice (double): used for storing the unit price of the item.
            quantity (int): used for storing the quantity of the item.

      Actions:
            calcCost(): calculates the total cost of the item.
            toString(): returns a string representation of the Item object with the full information of the item,
            including the total cost calculated by calcCost.


      Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */