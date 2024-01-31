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