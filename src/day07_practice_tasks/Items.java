package day07_practice_tasks;

public class Items {

    public String itemName;
    public double unitPrice;
    public int quantity;

    public double calcCost(){
        double totalCost = unitPrice * quantity;
        return totalCost;
    }

    public void setInfo(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString() {
        return "Items{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
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