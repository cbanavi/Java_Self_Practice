package day08_practice_tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String word = input.next();

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");
        }
        System.out.println(word);

        input.close();
    }
}
/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */