package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class MultiplyOdds {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('f', 5);

        System.out.println(map);

        for (Character eachKey : map.keySet()) {
            int value = map.get(eachKey);
            if (value % 2 != 0) {
                map.put(eachKey, value * 2);
            }
        }

        System.out.println(map);

    }

}

/*
1. Create a class named MultiplyOdds and write a program that takes a map with characters as keys
and integers as values. The program will iterate through the map and, for each entry where the value
is an odd number, it will multiply this value by two.

         Example:
               map = {'a'=1, 'b'=2, 'c'=3, 'd'=4, 'e'=5}

         Output:
            {'a'=2, 'b'=2, 'c'=6, 'd'=4, 'e'=10}
 */