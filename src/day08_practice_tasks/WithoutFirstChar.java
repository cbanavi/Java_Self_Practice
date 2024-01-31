package day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstWord = input.nextLine();
        String secondWord = input.nextLine();

        firstWord = firstWord.substring(1);
        secondWord = secondWord.substring(1);
        
        System.out.println(firstWord + secondWord);

    }
}

/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */