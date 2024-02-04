package day09_practice_tasks;

import java.util.Arrays;

public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (int rows = 0; rows < items.length; rows++) {
            for (int columns = 0; columns < items[rows].length; columns++) {

                System.out.print(items[rows][columns] + "\t");

            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------------------");

        for (int rows = 0; rows < items.length; rows++) {
            for (int columns = items.length; columns >= 0; columns--) {

                System.out.print(items[rows][columns] + "\t");

            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------------------");


        for (int arrays = items.length-1; arrays >= 0; arrays--) {

            for (int elements = 0; elements < items[arrays].length; elements++) {
                System.out.print(items[arrays][elements] + "\t");
            }
            System.out.println();
        }
        /*
        10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado
         */

    }
}

/*
10. Create a class named GroceryItems and write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };

    10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado
 */