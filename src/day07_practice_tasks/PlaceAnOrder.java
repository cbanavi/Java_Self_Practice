package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productName = input.nextLine();
        System.out.println("Enter the product price:");
        double productPrice = input.nextDouble();
        System.out.println("Enter the product quantity:");
        int productQuantity = input.nextInt();
        System.out.println("Enter your first name:");
        String firstName = input.next();
        double totalCost = productPrice * productQuantity;

        System.out.println(firstName + ", your order for " + productQuantity + " " +  productName + "'s has been placed. Your total is " + totalCost + ".");

        input.close();

    }

}