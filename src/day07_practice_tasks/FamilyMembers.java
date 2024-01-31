package day07_practice_tasks;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int numPeople = input.nextInt();

        while ((numPeople < 0)) {
            System.err.println("Invalid entry, please re-enter how many people you live with: ");
            numPeople = input.nextInt();
        }

        if (numPeople < 3) {
            System.out.println("Live with less than 3 people");
        } else if (numPeople >= 3 && numPeople <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else {
            System.out.println("Live with more than six people");
        }

        input.close();

    }
}