package day09_practice_tasks;

import java.util.Arrays;

public class Items {

    public static void main(String[] args) {
//5.1:
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int gloves = -1;
        boolean iPadInList = false;

        for (int i = 0; i < items.length; i++) {

            //5.2:
            if (items[i].equals("Gloves")) {
                gloves = i;
            }

            //5.3:
            if (items[i].equals("iPad")) {
                iPadInList = true;
            }

            //5.4:
            System.out.println(items[i] + " - " + prices[i] + " - #" + itemIDs[i]);

        }

        System.out.println("\n" + gloves);
        System.out.println("\n" + iPadInList);


    }
}

/*
5. Create a class named Items and write a program with the following specifications:
	5.1 Given arrays with the same length:
		String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
		int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID
*/