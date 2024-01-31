package LiveLabSessions;

public class PurchaseCalculator {

    public static void main(String[] args) {

        double salesTaxRate = .08;
        String itemName = "Fuji Apple";
        double unitPrice = 1.5;
        int quantity = 5;

        double totalBefore = unitPrice * quantity;

        System.out.println("itemName = " + itemName);
        System.out.println("Unit price: " + unitPrice);
        System.out.println("Quantity = " + quantity + "\n");
        System.out.println("Total cost before tax: $" + totalBefore);
        System.out.println("Sales tax: $" + (totalBefore * salesTaxRate));
        System.out.println("=================");
        System.out.println("Grand Total: $" + (totalBefore + (totalBefore * salesTaxRate)));
    }

}
