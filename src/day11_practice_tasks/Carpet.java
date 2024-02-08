package day11_practice_tasks;

public class Carpet {

    public double carpetWidth;
    public double carpetLength;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double carpetWidth, double carpetLength, double unitPrice, boolean isPersian) {
        this.carpetWidth = carpetWidth;
        this.carpetLength = carpetLength;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double totalCost = 0;

        totalCost = (carpetWidth * carpetLength) * unitPrice;

        if (this.isPersian == true) {
            totalCost += 200;
        }
        return totalCost;
    }


    public String toString() {
        return "Carpet{" +
                "carpetWidth=" + carpetWidth +
                ", carpetLength=" + carpetLength +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}

/*
2. Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */