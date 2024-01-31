package day08_practice_tasks;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st word: ");
        String firstWord = input.nextLine().toLowerCase();

        System.out.println("Enter 2nd word: ");
        String secondWord = input.nextLine().toLowerCase();


        if (firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
            String combinedWord = firstWord.substring(0, (firstWord.length()-1)) + secondWord;
            System.out.println(combinedWord);
        }
        input.close();
    }
}
/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */