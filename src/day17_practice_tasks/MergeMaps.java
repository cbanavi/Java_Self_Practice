package day17_practice_tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MergeMaps {

    public static void main(String[] args) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        Map<Character, Integer> mergedMap = new TreeMap<>();

        map1.put('A', 10);
        map1.put('B', 20);

        map2.put('B', 30);
        map2.put('C', 40);

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                map2.put(entry.getKey(), map2.get(entry.getKey()) + entry.getValue());
            } else {
                map2.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(map2);

    }

}

/*
3. Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}
 */