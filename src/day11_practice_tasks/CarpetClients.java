package day11_practice_tasks;

public class CarpetClients {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(4.5, 3.2, 200, true);
        System.out.println(carpet1);
        System.out.println("Total for the carpet: $" + carpet1.calcCost());

        Carpet carpet2 = new Carpet(5.5, 2.2, 100, true);
        System.out.println(carpet2);
        System.out.println("Total for the carpet: $" + carpet2.calcCost());

        Carpet carpet3 = new Carpet(2.5, 6.2, 150, true);
        System.out.println(carpet3);
        System.out.println("Total for the carpet: $" + carpet3.calcCost());

    }
}