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