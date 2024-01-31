package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.nextLine().toLowerCase();

        String firstName = email.substring(0, email.indexOf("_")).toLowerCase();
        String lastName = email.substring((email.indexOf("_") + 1), email.indexOf("@")).toLowerCase();
        String domain = email.substring((email.indexOf("@")+1), email.indexOf(".")).toLowerCase();

        System.out.println("First name: " + firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase());
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());
        System.out.println("Domain: " + domain);

        input.close();
    }

}

/*
5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */