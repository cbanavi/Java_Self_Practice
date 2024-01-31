package day08_practice_tasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)?");
        String checkSplit = input.nextLine().toLowerCase();
        while (!(checkSplit.equals("yes") || checkSplit.equals("no"))) {
            System.err.println("Invalid entry, please re-enter! Split or No Split (Yes/No)?");
            checkSplit = input.nextLine().toLowerCase();
        }

        if (checkSplit.equals("yes")) { //If split check is "yes", it calculates and displays per person costs
            System.out.println("Enter the number of people:");
            int numberPeople = input.nextInt();
            while (numberPeople < 0) {
                System.err.println("Invalid entry, please re-enter! Enter the number of people:");
                numberPeople = input.nextInt();
            }

            System.out.println("Enter the check amount:");
            int checkAmount = input.nextInt();
            while (checkAmount < 0) {
                System.err.println("Invalid entry, please re-enter! Enter the check amount:");
                checkAmount = input.nextInt();
            }

            input.nextLine();

            System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
            String serviceQuality = input.nextLine().toLowerCase();
            while (!(serviceQuality.equals("excellent") || (serviceQuality.equals("great") || (serviceQuality.equals("good")
                    || (serviceQuality.equals("fair") || (serviceQuality.equals("poor"))))))) {
                System.err.println("Invalid entry, please re-enter! How was the service quality? (Excellent/Great/Good/Fair/Poor)");
                serviceQuality = input.nextLine();
            }


            Tip tip = new Tip();
            tip.setInfoSplitYes(checkSplit, numberPeople, checkAmount, serviceQuality);
            System.out.println(tip.splitYes());

            input.close();
        } else { //If split check "no", it skips "number of people" since it's not being split.
                 // Then calculates and displays only totalTip and totalToPay

            System.out.println("Enter the check amount:");
            int checkAmount = input.nextInt();
            while (checkAmount < 0) {
                System.err.println("Invalid entry, please re-enter! Enter the check amount:");
                checkAmount = input.nextInt();
            }

            input.nextLine();

            System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
            String serviceQuality = input.nextLine().toLowerCase();
            while (!(serviceQuality.equals("excellent") || (serviceQuality.equals("great") || (serviceQuality.equals("good")
                    || (serviceQuality.equals("fair") || (serviceQuality.equals("poor"))))))) {
                System.err.println("Invalid entry, please re-enter! How was the service quality? (Excellent/Great/Good/Fair/Poor)");
                serviceQuality = input.nextLine();
            }


            Tip tip = new Tip();
            tip.setInfoSplitNo(checkSplit, checkAmount, serviceQuality);
            System.out.println(tip.splitNo());

            input.close();
        }

    }
}