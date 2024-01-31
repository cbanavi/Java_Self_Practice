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