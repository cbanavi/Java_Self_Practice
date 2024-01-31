package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents:");
        int cents = input.nextInt();

        while (cents < 0) {
            System.err.println("Invalid input, please re-enter the cents: ");
            cents = input.nextInt();
        }

        int centsToDollar = cents / 100;
        int remainderCent = cents % 100;

        System.out.println(cents + " cents is equal to " + centsToDollar + " dollars and " + remainderCent + " cents");

        input.close();

    }
}
