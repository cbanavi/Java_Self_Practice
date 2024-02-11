package day11_practice_tasks;

public class PizzaClients {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Tiny",50, 25);
        Pizza pizza2 = new Pizza("Medium", 2, 1);
        Pizza pizza3 = new Pizza("Large", 1, 0);

        System.out.println(pizza1);
        System.out.println(pizza1.calcCost());

        System.out.println(pizza2);
        System.out.println(pizza2.calcCost());

        System.out.println(pizza3);
        System.out.println(pizza3.calcCost());

    }

}

/*
1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
 */