package LiveLabSessions;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageCalculator {

    public static void main(String[] args) {

        int loanAmount = 500000;
        int loanTermInYears = 30;
        String loanType = "Fixed";

/*
        double annualInterestRate = (loanType == "Fixed" && loanTermInYears == 30)? 7.5 :
                                    (loanType == "Fixed" && loanTermInYears == 15)? 6.9 :
                                    (loanType == "FHA" && loanTermInYears == 30)  ? 7.24 :
                                    (loanType == "FHA" && loanTermInYears == 15)  ? 6.62 :
                                    (loanType == "VA" && loanTermInYears == 30)   ? 6.75 :
                                    (loanType == "VA" && loanTermInYears == 15)   ? 5.99 : 0.0;

 */
/*

        if (loanType == "Fixed" && loanTermInYears == 30) {
            annualInterestRate = 7.5;
        } else if ((loanType == "Fixed" && loanTermInYears == 15)) {
            annualInterestRate = 6.9;
        } else if ((loanType == "FHA" && loanTermInYears == 30)) {
            annualInterestRate = 7.24;
        } else if ((loanType == "FHA" && loanTermInYears == 15)) {
            annualInterestRate = 6.62;
        } else if ((loanType == "VA" && loanTermInYears == 30)) {
            annualInterestRate = 6.75;
        } else if ((loanType == "VA" && loanTermInYears == 15)) {
            annualInterestRate = 5.99;
        } */

        double annualInterestRate = 0.0;

        switch (loanType) {
            case "Fixed" -> {
                if (loanTermInYears == 30) annualInterestRate = 7.5;
                if (loanTermInYears == 15) annualInterestRate = 6.9;
                break;
            }

            case "FMA" -> {
                if (loanTermInYears == 30) annualInterestRate = 7.24;
                if (loanTermInYears == 15) annualInterestRate = 6.62;
                break;
            }

            case "VA" -> {
                if (loanTermInYears == 30) annualInterestRate = 6.75;
                if (loanTermInYears == 15) annualInterestRate = 5.99;
                break;
            }
        }

        switch (loanType) {
            case "Fixed":
                if (loanTermInYears == 30) annualInterestRate = 7.5;
                if (loanTermInYears == 15) annualInterestRate = 6.9;
                break;


            case "FMA":
                if (loanTermInYears == 30) annualInterestRate = 7.24;
                if (loanTermInYears == 15) annualInterestRate = 6.62;
                break;


            case "VA":
                if (loanTermInYears == 30) annualInterestRate = 6.75;
                if (loanTermInYears == 15) annualInterestRate = 5.99;
                break;
        }


/*
        if (loanType == "Fixed") {
            if (loanTermInYears == 30) annualInterestRate = 7.5;
            if (loanTermInYears == 15) annualInterestRate = 6.9;
        }
        if (loanType == "FHA") annualInterestRate = 6.9;
        {
            if (loanTermInYears == 30) annualInterestRate = 7.24;
            if (loanTermInYears == 15) annualInterestRate = 6.62;
        }
        if (loanType == "VA") {
            if (loanTermInYears == 30) annualInterestRate = 6.75;
            if (loanTermInYears == 15) annualInterestRate = 5.99;
        }
*/

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        monthlyPayment = Math.round(monthlyPayment);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        String monthlyPaymentInFormat = currencyFormat.format(monthlyPayment);

        System.out.println("Your monthly mortgage payment for a " + loanTermInYears + " Yr. Fixed loan is: " + monthlyPaymentInFormat);
    }
}

    /*
    2. Create a Java class named MortgageCalculator with the following requirements:

        2.1 Define the following variables:

                loanAmount: Represents the loan amount.
                loanTermInYears: Represents the loan term in years.
                loanType: Represents the type of loan.

        2.2 Determine the annual interest rates for different loan types:

                Fixed:
                    30 years: 7.5%
                    15 years: 6.9%

                FHA:
                    30 years: 7.24%
                    15 years: 6.62%

                VA:
                    30 years: 6.75%
                    15 years: 5.99%

        2.3 Write a program to calculate the monthly mortgage payment using the following formula:



    2.4 Display the output in the following format:

            Example 1:
                loanAmount = $500,000
                loanTermInYears = 30
                loanType = "Fixed"

            Output:
                Your monthly mortgage payment for a 30 Yr. Fixed loan is: $3,496.00


    Ensure that the program accurately calculates the monthly mortgage payment based on the
    specified loan amount, term, and type.





 */