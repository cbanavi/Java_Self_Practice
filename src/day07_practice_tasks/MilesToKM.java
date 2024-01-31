package day07_practice_tasks;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles:");
        double miles = input.nextDouble();

        while (miles < 0) {
            System.err.println("Invalid input, please re-enter the miles:");
        }

        double kilometers = miles * 1.6;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");

    }
}