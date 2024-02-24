package day17_practice_tasks;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        String string = "aabcccdeeeefgg";

        Map<Character, Integer> map = new LinkedHashMap<>(); //LinkedHashMap keeps insertion order
        Map<Character, Integer> uniqueCharacters = new LinkedHashMap<>(); //LinkedHashMap keeps insertion order


        for (char c : string.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            if (each.getValue() == 1) {
                uniqueCharacters.put(each.getKey(), each.getValue());
            }
        }

        System.out.println(uniqueCharacters);

    }

}

/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */