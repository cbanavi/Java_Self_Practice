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