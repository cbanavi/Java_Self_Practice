package day16_practice_tasks;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "xyze";
        String str2 = "xyzd";

        Set<Character> set1 = new HashSet<>(); //Hashset removes duplicates
        Set<Character> set2 = new HashSet<>();

        for (char each : str1.toCharArray()) {
            set1.add(each);
        }

        for (char each : str2.toCharArray()) {
            set2.add(each);
        }

        if (set1.equals(set2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }

}

/*
5. Create a class named Anagram and write a program that checks if two strings are anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */