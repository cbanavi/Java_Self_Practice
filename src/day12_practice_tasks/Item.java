package day12_practice_tasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()|| name.isEmpty()) {
            throw new RuntimeException("The name must start with letters and cannot be empty");
        }

        for (char each : name.toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                throw new RuntimeException("The name cannot contain special characters.");
            }
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            throw new RuntimeException("The unitPrice cannot be zero");
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new RuntimeException("The quantity cannot be zero");
        }
        this.quantity = quantity;
    }

    public double calcCost() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}