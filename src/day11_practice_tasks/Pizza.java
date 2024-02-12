package day11_practice_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {
        int totalCost = 0;

        if (size == "Small") {
            return totalCost = 10 + (2 * this.numberOfCheeseTopping) + (2 * this.numberOfPepperoniTopping);
        } else if (size == "Medium") {
            return totalCost = 12 + ((2 * this.numberOfCheeseTopping) + (2 * this.numberOfPepperoniTopping));
        } else if (size == "Large") {
            return totalCost = 14 + ((2 * this.numberOfCheeseTopping) + (2 * this.numberOfPepperoniTopping));
        } else {
            return 0;
        }

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
}